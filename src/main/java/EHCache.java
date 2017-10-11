import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

/**
 * Created by zhiming.wu on 2017/10/11.
 */
public class EHCache {
//        private static final CacheManager cacheManager = new CacheManager();
    private Cache cache;

    public EHCache() {
//        this.cache = cacheManager.getCache("ehcacheName");
        this.cache = SystemCacheManager.getCache("ehcacheName");
    }

    public Cache getCache() {
        return cache;
    }

    public void setCache(Cache cache) {
        this.cache = cache;
    }

    /*
     从缓存中取数据
     */
    public Object getCacheElement(String cacheKey) throws Exception{
        Element element = cache.get(cacheKey);
        if (element == null){
            return null;
        }
        return element.getObjectValue();
    }

    /*
    将对象放入缓存中
     */
    public void addToCache(String cacheKey, Object result) throws Exception{
        Element element = new Element(cacheKey, result);
        cache.put(element);
    }
}
