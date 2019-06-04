package com.isfong.sharding.jdbc.demo.config;

import lombok.RequiredArgsConstructor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan( "com.isfong.sharding.jdbc.demo.mapper" )
@RequiredArgsConstructor
public class MybatisPlusConfigure {

//    private final DataSourceUtil dataSourceMap;
//
//    @Bean
//    public DataSource dataSource() {
//         return ShardingDataSourceFactory.createDataSource(dataSourceMap, shardingRuleConfig);
//    }
}
