package com.example.eximap_nisarg.data.api

import com.example.eximap_nisarg.util.Constants.Companion.metadata
import com.kotlang.social.GetFeedRequest
import com.kotlang.social.UserPostGrpc
import com.kotlang.social.UserPostProto
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import io.grpc.stub.MetadataUtils

class GrpcApi {

    private val channel: ManagedChannel = ManagedChannelBuilder.forAddress("social.navachar.co", 50051)
        .intercept(MetadataUtils.newAttachHeadersInterceptor(metadata))
        .usePlaintext()
        .build()

    private val client = UserPostGrpc.newBlockingStub(channel)

    fun getFeedList(pageNum:Int,pageSize: Int): List<UserPostProto> {

        val feedRequest = GetFeedRequest.newBuilder()
            .setPageNumber(pageNum)
            .setPageSize(pageSize)
            .build()

        val response = client.getFeed(feedRequest)

        return response.postsList
    }


}