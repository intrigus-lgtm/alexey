public class MyListMyListMyListIsOnFire {

  private volatile List<Integer> list;

  void prepareList() {
     list = new ArrayList();
     list.add(1);
     list.add(2);
  }

  List<Integer> getMyList() {
     return list;
  }
}
