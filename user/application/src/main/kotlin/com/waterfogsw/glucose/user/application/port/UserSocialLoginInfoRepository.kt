package com.waterfogsw.glucose.user.application.port

import com.waterfogsw.glucose.user.domain.enums.OAuth2Provider
import com.waterfogsw.glucose.user.domain.entity.UserSocialLoginInfo

interface UserSocialLoginInfoRepository {

    fun save(userSocialLoginInfo: UserSocialLoginInfo)
    fun findBySubAndProvider(
        sub: String,
        oAuth2Provider: OAuth2Provider,
    ): UserSocialLoginInfo?
}
