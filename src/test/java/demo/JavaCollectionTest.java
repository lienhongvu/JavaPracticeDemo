package demo;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.lienhongvu.datastructure.linkedlist.MyDoublyLinkedList;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.PredicateUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.concurrent.ThreadSafe;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by hvlien on 7/26/2018.
 */
@ThreadSafe
public class JavaCollectionTest {

    // SOURCE : http://www.baeldung.com/java-remove-nulls-from-list

    @Before
    public void setUp() throws Exception {
    }

    // Solution 1: using while loop in java
    @Test
    public void removeNullsFromList1() throws Exception {
        List<Integer> list = Lists.newArrayList(1, null, null);
        while (list.remove(null));
        Assert.assertEquals(1, list.size());
    }

    // Solution 2: using removeAll of list
    @Test
    public void removeNullFromList2() throws Exception {
        List<Integer> list = Lists.newArrayList(1, null, null);
        list.removeAll(Collections.singleton(null));
        Assert.assertEquals(1, list.size());
    }

    // Solution 3,4: using guava
    @Test
    public void removeNullFromList3() throws Exception {
        List<Integer> list = Lists.newArrayList(1, null, null);

        Iterables.removeIf(list, Predicates.isNull());

        Assert.assertEquals(1, list.size());
    }

    @Test
    public void removeNullFromList4() throws Exception {
        List<Integer> list = Lists.newArrayList(1, null, null);
        List<Integer> finalList = Lists.newArrayList(Iterables.filter(list, Predicates.notNull()));
        Assert.assertEquals(1, finalList.size());
    }

    // Solution 5: using apache common collections
    @Test
    public void removeNullFromList5() throws Exception {
        List<Integer> list = Lists.newArrayList(1, null, null);
        CollectionUtils.filter(list, PredicateUtils.notNullPredicate());
        Assert.assertEquals(1, list.size());
    }

    // Solution 6,7: using apache common collections
    @Test
    public void removeNullFromList6() throws Exception {
        List<Integer> list = Lists.newArrayList(1, null, null);
        List<Integer> listWithoutNulls = list.parallelStream().filter(Objects::nonNull).collect(Collectors.toList());
        Assert.assertEquals(1, listWithoutNulls.size());
    }

    @Test
    public void removeNullFromList7() throws Exception {
        List<Integer> list = Lists.newArrayList(1, null, null);
        list.removeIf(Objects::isNull);
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void test() throws Exception {
        int[] a = new int[10];
        MyDoublyLinkedList[] myDoublyLinkedList = {};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            System.out.println(myDoublyLinkedList[i]);
        }
    }
}
