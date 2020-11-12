package com.chungyo.sharding.algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;

public class ChauDanComplexAlgorithm implements ComplexKeysShardingAlgorithm<String> {

  @Override
  public Collection<String> doSharding(
      Collection<String> availableTargetNames, ComplexKeysShardingValue<String> shardingValue) {
    System.out.println("ChauDanComplexAlgorithm======================>" + shardingValue);

    Integer agid = 0;
    Integer userId = 0;
    if (shardingValue.getColumnNameAndShardingValuesMap().containsKey("agid")) {
      agid =
          Integer.parseInt(
              shardingValue
                  .getColumnNameAndShardingValuesMap()
                  .get("agid")
                  .toArray()[0]
                  .toString());
    }
    if (shardingValue.getColumnNameAndShardingValuesMap().containsKey("userid")) {
      userId =
          Integer.parseInt(
              shardingValue
                  .getColumnNameAndShardingValuesMap()
                  .get("userid")
                  .toArray()[0]
                  .toString());
    }

    if (availableTargetNames == null
        || availableTargetNames.isEmpty()
        || agid == null
        || agid == 0) {
      return null;
    }

    System.out.println("agid======================>" + agid);
if (agid == 26891) {
      if (userId == null || userId == 0) {
        List<String> list = new ArrayList<>();
        for (String s : availableTargetNames) {
          if (s.endsWith("_26891")) {
            list.add(s);
          }
        }
        return list;
      }
      for (String s : availableTargetNames) {
        int hash = userId % 2;
        if (s.endsWith(hash + "_26891")) {
          List<String> list = new ArrayList<>();
          list.add(s);
          return list;
        }
      }
    } else {
      for (String s : availableTargetNames) {
        int hash = agid % 2;
        if (s.endsWith("_" + hash)) {
          List<String> list = new ArrayList<>();
          list.add(s);
          System.out.println("ChauDanComplexAlgorithm======================>" + s);
          return list;
        }
      }
    }

    throw new UnsupportedOperationException();
  }
}
