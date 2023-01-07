
package nuc.edu.cai4.ioc.service.impl;

import lombok.Data;
import nuc.edu.cai4.ioc.dao.IUserDao;
import nuc.edu.cai4.ioc.service.IUserService;

@Data
public class IUserServiceImpl implements IUserService {
    private IUserDao userDao;
    private String name;


  /*  public void setList(List list) {
        this.list = list;
    }

    private List<String> list;

    public void setArr(String[] arr) {
        this.arr = arr;
    }*/

   /* private String[] arr;

    public void setSet(Set<String> set) {
        this.set = set;
    }*/

   /* private Set<String> set;

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    private Map<String, String> map;*/

   /* public IUserServiceImpl(IUserDaoImpl userClientDao) {
        this.userClientDao=userClientDao;
    }*/

  /*  public void setUserDao(IUserDaoImpl userDao) {
        this.userDao = userDao;
    }*/
   /* public IUserServiceImpl() {
    }*/
    @Override
    public void save() {
        System.out.println("业务层调用持久层"+name);
        userDao.save();
        /*for (String str:list
             ) {
            System.out.println(str);
        }
        for (String str:arr
             ) {
            System.out.println(str);
        }
        for (String s:set
             ) {
            System.out.println(s);
        }
        Iterator<Map.Entry<String, String>> entries = map.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<String, String> entry = entries.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+":"+value);
        }*/
    }

}
