import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;

import java.net.URL;

/**
 * 缓存管理器
 * Created by zhiming.wu on 2017/10/11.
 */
public class SystemCacheManager {

    /*private static final CacheManager cacheManager = new CacheManager();//基于xml配置，放入了applicationContext中可以

    private static URL url = CacheManager.class.getResource("/ehcache.xml");
    private static final CacheManager cacheManagerUrl = new CacheManager(url);*/

    private static String filePath = CacheManager.class.getResource("/ehcache.xml").getFile();
    private static final CacheManager cacheManagerFilePath = new CacheManager(filePath);



    public static Cache getCache(String cacheName){
//        return cacheManager.getCache(cacheName);//方式1：xml 配置在applicationContext.xml
//        return cacheManagerUrl.getCache(cacheName);//方式2：使用文件路径url
        return cacheManagerFilePath.getCache(cacheName);//方式3：使用文件路径String
    }
}
