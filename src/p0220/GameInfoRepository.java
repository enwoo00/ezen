package p0220;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import p0219.DBCon;

public class GameInfoRepository {
	public GameInfoVO selectGameInfo(int giNum) {
		String sql = "SELECT GI_NUM, GI_NAME, GI_PRICE, GI_GENRE, GI_DESC FROM GAME_INFO WHERE GI_NUM=?";
		try (Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setInt(1,giNum);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				GameInfoVO game = new GameInfoVO();
				game.setGiNum(rs.getInt("GI_NUM"));
				game.setGiName(rs.getString("GI_NAME"));
				game.setGiPrice(rs.getInt("GI_PRICE"));
				game.setGiGenre(rs.getString("GI_GENRE"));
				game.setGiDesc(rs.getString("GI_DESC"));
				return game;
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<GameInfoVO> selectGameInfoList(GameInfoVO gameInfo) {
		List<GameInfoVO> gameInfoList = new ArrayList<>();
		String sql = "SELECT GI_NUM, GI_NAME, GI_PRICE, GI_GENRE, GI_DESC FROM GAME_INFO WHERE 1=1 ";
		if(gameInfo!=null) {
			if(gameInfo.getGiName()!=null && gameInfo.getGiName().length()!=0) {
				sql += " AND GI_NAME LIKE CONCAT('%',?,'%')";				
			}
			if(gameInfo.getGiPrice()!=0) {
				sql += " AND GI_Price=?";
			}
			if(gameInfo.getGiGenre()!=null && gameInfo.getGiGenre().length()!=0) {
				sql += " AND GI_GENRE LIKE CONCAT('%',?,'%')";	
			}
			if(gameInfo.getGiDesc()!=null && gameInfo.getGiDesc().length()!=0) {
				sql += " AND GI_DESC LIKE CONCAT('%',?,'%')";	
			}
		}
		
		try (Connection con=DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			if(gameInfo!=null) {
				if(gameInfo.getGiName()!=null && gameInfo.getGiName().length()!=0) {
					ps.setString(1, gameInfo.getGiName());
				}
				if(gameInfo.getGiPrice()!=0) {
					if(gameInfo.getGiName()!=null && gameInfo.getGiName().length()!=0) {
						ps.setInt(2, gameInfo.getGiPrice());
					}else {
						ps.setInt(1, gameInfo.getGiPrice());
					}
				}
				
				if(gameInfo.getGiGenre()!=null && gameInfo.getGiGenre().length()!=0) {
					if((gameInfo.getGiName()!=null && gameInfo.getGiName().length()!=0)&& gameInfo.getGiPrice()!=0) {
						ps.setString(3, gameInfo.getGiGenre());
					}else if((gameInfo.getGiName()!=null && gameInfo.getGiName().length()!=0) || gameInfo.getGiPrice()!=0) {
						ps.setString(2, gameInfo.getGiGenre());
					}else {
						ps.setString(1, gameInfo.getGiGenre());
					}
				}
				
				
				if(gameInfo.getGiDesc()!=null && gameInfo.getGiDesc().length()!=0) {
					if((gameInfo.getGiName()!=null && gameInfo.getGiName().length()!=0)
							&& gameInfo.getGiPrice()!=0 
							&&(gameInfo.getGiGenre()!=null && gameInfo.getGiGenre().length()!=0)) {
						ps.setString(4, gameInfo.getGiDesc());
					}else if((gameInfo.getGiName()!=null && gameInfo.getGiName().length()!=0)&& gameInfo.getGiPrice()!=0 
							||gameInfo.getGiPrice()!=0 &&(gameInfo.getGiGenre()!=null && gameInfo.getGiGenre().length()!=0)
							|| (gameInfo.getGiName()!=null && gameInfo.getGiName().length()!=0) && (gameInfo.getGiGenre()!=null && gameInfo.getGiGenre().length()!=0)
							) {
						ps.setString(3, gameInfo.getGiDesc());
					}else if((gameInfo.getGiName()!=null && gameInfo.getGiName().length()!=0) 
							|| gameInfo.getGiPrice()!=0
							||(gameInfo.getGiGenre()!=null && gameInfo.getGiGenre().length()!=0)) {
						ps.setString(2, gameInfo.getGiDesc());
					}else {
						ps.setString(1, gameInfo.getGiDesc());
					}
				}	
			}
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				GameInfoVO game = new GameInfoVO();
				game.setGiNum(rs.getInt("GI_NUM"));
				game.setGiName(rs.getString("GI_NAME"));
				game.setGiPrice(rs.getInt("GI_PRICE"));
				game.setGiGenre(rs.getString("GI_GENRE"));
				game.setGiDesc(rs.getString("GI_DESC"));
				gameInfoList.add(game);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return gameInfoList;
	}
	
	public static void main (String [] args ) {
		GameInfoRepository giRepo = new GameInfoRepository();
		GameInfoVO game = giRepo.selectGameInfo(5);
		System.out.println(game);
		
		game = new GameInfoVO();
		game.setGiName("삼");
		game.setGiPrice(30000);
		game.setGiGenre("전략");
		game.setGiDesc("옛날");
		List<GameInfoVO> gameInfoList = giRepo.selectGameInfoList(game);
		for(GameInfoVO gameInfo : gameInfoList) {
			System.out.println(gameInfo);
		}
	}
}
