package com.lcp.bubble.sort;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CopyOfHaXi {

	public static void main(String[] args){
		String source="肃宁地域开发甚早，原始社会已有人类聚居。春秋时期，今肃宁县地属晋国。周显王十九年（前350年），前燕置武垣县（县治在今肃宁县城东南7.8公里）。赵武灵王二十六年（前300年），武垣属赵国。西汉，武垣县属幽州涿郡。新莽时期，武垣改称垣翰亭。东汉建安十一年（206年），武垣徒治东武垣城（今河间市城南12.5公里），辖域仍含今肃宁全境。初属幽州涿郡，后改隶冀州河间国。三国魏时隶属不变。西晋时期，武垣县改属冀州高阳郡。十六国时期，武垣县先后为后燕、后赵地，属冀州高阳郡。北朝时期，武垣县先后为北魏、东魏、北齐地，隶属于瀛州河间郡。隋开皇三年（583年），武垣县治迁至瀛州城。开皇十六年（596年），武垣县改名河间县，初属瀛州，大业三年（607年）改隶河间郡。唐武德五年（622年），复置武垣县。贞观元年（627年），武垣县并入河间县。后晋高祖天福元年（936年），石敬瑭把幽云十六州割让给契丹，今肃宁境域属契丹。后周显德六年（959年）收复，仍属瀛州。北宋雍熙三年（986年），在河间县西置平虏寨。景德二年（1005年）改为肃宁城（今肃宁镇）。金正隆元年（1156年），置肃宁县，属河北东路河间府。元至元二年（1265），废肃宁县为镇，入河间县，隶中书省河间路。后恢复原建制。明洪武元年（1368）十月始，肃宁县属河间府。清代，肃宁县属直隶省河间府。宣统三年（1911年），肃宁归天津河间道。民国二年（1913年），肃宁县属直隶省渤海道。民国三年（1914年），属直隶省津海道。民国十七年（1928年），直隶省改为河北省，肃宁县属之。民国二十五年（1936年），属河北省沧县行政区。民国二十六年（1937年），属河北省第六行政督察区。民国二十七年（1938年）2月，中共肃宁县抗日民主政府成立，属冀中区一专区。民国二十八年（1939年）2月，改属四专区。民国二十九年（1940年），肃宁县属冀中区十专区。民国三十四年（1945）10月，肃宁县改属冀中区八专区。民国三十五年（1946）7月又改属九专区。民国三十八年（1949年）8月1日，河北省人民政府成立，肃宁划属沧县地区专员公署。1952年11月，肃宁县改属定县地区专员公署。1954年4月，定县地区专员公署撤销，肃宁县复属沧县地区专员公署。1958年6月15日，撤销沧县地区专员公署，肃宁县改属天津地区专员公署。1958年11月20日，撤销肃宁县，并入河间县，归天津市管辖。1962年3月27日，恢复肃宁县建制，隶沧州地区专员公署。1993年7月，沧州地区与原沧州市合并为地级沧州市，肃宁县隶属沧州市";
		String str = source.replaceAll("\\、","");
		String str1 = str.replaceAll("\\.","");
		String str2 = str1.replaceAll("\\。","");
		count(str2);
	}
	
	public static void count(String str){
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		long start = System.currentTimeMillis();
		
		TreeMap<String,Integer> map = null;
		for(int x=0;x<1;x++){//循环做10万遍
			map = new TreeMap<String, Integer>();
			for(int i=0;i<str.length();i++){
				String word = str.substring(i,i+1);
				if(map.get(word) == null){
					map.put(word,1);
				}
				else
					{
					map.put(word,1+map.get(word));
					}
				
			}
			System.out.println(map);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("耗时:"+(end-start)+"毫秒");
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		
		Map.Entry<String,Integer>[] entries = new Map.Entry[(map.entrySet().size())];
		for(Entry<String, Integer> entry:map.entrySet()){
			
		}
	}
}
