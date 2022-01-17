package lib;

public class MyHash {
    public Slot[] hashTable;

    public MyHash(Integer size) {
        this.hashTable = new Slot[size];
    }

    public class Slot {
        String key;
        String value;
        Slot next;
        Slot(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public int hashFunc(String key) {
        return (int)(key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveData(String key, String value) {
        Integer address = this.hashFunc(key);
        System.out.println("========================");
        System.out.println("key:"+key);
        System.out.println("address:"+address);
        System.out.println("hashTable[addr]:"+this.hashTable[address]);

        if (this.hashTable[address] != null) {
            Slot findSlot = this.hashTable[address];
            Slot prevSlot = this.hashTable[address];

            //링크드리스트 마지막까지 순회.
            while (findSlot != null) {
                System.out.printf("slot : %s  key: %s \n",findSlot.key, key);
                //같은 키로 해시값이 바뀌면 링크드리스트에서 바꾼다.
                if (findSlot.key == key) {
                    System.out.println("here?");
                    findSlot.value = value;
                    return true;
                } else {
                    prevSlot = findSlot;
                    findSlot = findSlot.next;
                }
            }
            prevSlot.next = new Slot(key, value);
        } else {
            this.hashTable[address] = new Slot(key, value);
        }
        return true;
    }

    public String getData(String key) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            Slot findSlot = this.hashTable[address];
            while (findSlot != null) {
                if (findSlot.key == key) {
                    return findSlot.value;
                } else {
                    findSlot = findSlot.next;
                }
            }
            return null;
        } else {
            return null;
        }
    }
}