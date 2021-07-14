package com.company.InnerAbstractClassAndInterfaces;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
   List<String> write();
    void read(List<String> savesValues);
}
