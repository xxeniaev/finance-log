package ru.dreamteam.business.handlers.user

import derevo.derive
import derevo.tethys._
import ru.dreamteam.business.{Token, User}
import sttp.tapir.description

case class PersonalInfoRequest(userId: Int)

@derive(tethysReader, tethysWriter)
@description("Информация о пользователе")
case class PersonalInfoResponse(
  @description("Логин пользователя") login: String
)

case class RegistrationRequest(login: String, password: String)

@derive(tethysReader, tethysWriter)
@description("Регистрация пользователя")
case class RegistrationResponse(
  @description("Пользователь") user: User
)

case class LoginRequest(login: String, password: String)

@derive(tethysReader, tethysWriter)
@description("Вход пользователя")
case class LoginResponse(
  @description("Token") token: Token
)



@derive(tethysReader, tethysWriter)
case class Credentials(login: String, password: String)