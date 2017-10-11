import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;

/**
 * 测试
 * Created by zhiming.wu on 2017/10/11.
 */
public class Client {
    public static void main(String[] args) throws Exception {
        EHCache ehCache = new EHCache();
        JSONObject jsonObject = new JSONObject();

        //数据放入缓存
        jsonObject.put("name","lszhen");
        ehCache.addToCache("cache_jason",jsonObject);

        //从缓存中取数据
         JSONObject obj= (JSONObject) ehCache.getCacheElement("cache_jason");
         System.out.println(obj.toJSONString());
    }
}
