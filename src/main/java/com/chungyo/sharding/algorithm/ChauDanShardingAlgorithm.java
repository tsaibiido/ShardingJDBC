package com.chungyo.sharding.algorithm;

import java.util.Collection;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

public class ChauDanShardingAlgorithm implements PreciseShardingAlgorithm<Integer> {

  public ChauDanShardingAlgorithm() {
    // TODO Auto-generated constructor stub
  }

  /**
   * databaseNames 所有分片庫的集合
   * shardingValue 為分片屬性，其中 logicTableName 為邏輯表，columnName 分片健（字段），value 為從 SQL 中解析出的分片健的值
   */
  @Override
  public String doSharding(
      Collection<String> availableTargetNames, PreciseShardingValue<Integer> shardingValue) {
	  for (String databaseName : availableTargetNames) {
		  String value = "1";
		  if(shardingValue.getValue()==26891) {
			  value = "26891";
		  }
		  System.out.println("ChauDanShardingAlgorithm====>"+value);
          if (databaseName.endsWith(value)) {
              return databaseName;
          }
      }
      throw new IllegalArgumentException();
  }
}
