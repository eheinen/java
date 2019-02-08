package com.richard.dynkot

import com.amazonaws.auth.profile.ProfileCredentialsProvider
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder
import com.amazonaws.services.dynamodbv2.document.DynamoDB
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableDynamoDBRepositories
class DynamoDbConfiguration {
    @Bean("amazonDynamoDB")
    fun dynamoDb() : AmazonDynamoDB {
        val client : AmazonDynamoDB = AmazonDynamoDBClientBuilder
                    .standard()
                    .withCredentials(ProfileCredentialsProvider("XXX"))
                    .withRegion("XXX")
                    .build()
        DynamoDB(client).getTable("dev-user").waitForActive()
        return client
    }
}