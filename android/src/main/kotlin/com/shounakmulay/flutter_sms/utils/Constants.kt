package com.shounakmulay.flutter_sms.utils

import android.provider.Telephony

object Constants {
  
  // Channels
  const val CHANNEL_SMS = "plugins.shounakmulay.com/foreground_sms_channel"
  const val CHANNEL_SMS_BACKGROUND = "plugins.shounakmulay.com/background_sms_channel"
  const val CHANNEL_SEND_SMS_STREAM = "plugins.shounakmulay.com/send_sms_stream"

  // Intent Actions
  const val ACTION_SMS_SENT = "plugins.shounakmulay.intent.ACTION_SMS_SENT"
  const val ACTION_SMS_DELIVERED = "plugins.shounakmulay.intent.ACTION_SMS_DELIVERED"

  const val SMS_SENT = "SMS_SENT"
  const val SMS_DELIVERED = "SMS_DELIVERED"

  // Permissions
  val SMS_PERMISSIONS = listOf(android.Manifest.permission.READ_SMS, android.Manifest.permission.SEND_SMS, android.Manifest.permission.RECEIVE_SMS)

  // Request Codes
  const val SMS_QUERY_REQUEST_CODE = 1
  const val SMS_SEND_REQUEST_CODE = 2
  const val SMS_SENT_BROADCAST_REQUEST_CODE = 21
  const val SMS_DELIVERED_BROADCAST_REQUEST_CODE = 22
  const val SMS_BACKGROUND_REQUEST_CODE = 31

  // Methods
  const val ON_MESSAGE = "onMessage"
  const val HANDLE_BACKGROUND_MESSAGE = "handleBackgroundMessage"
  
  // Invoke Method Arguments
  const val HANDLE = "handle"
  const val MESSAGE = "message"

  // Method Call Arguments
  const val PROJECTION = "projection"
  const val SELECTION = "selection"
  const val SELECTION_ARGS = "selection_args"
  const val SORT_ORDER = "sort_order"
  const val MESSAGE_BODY = "message_body"
  const val ADDRESS = "address"
  const val LISTEN_STATUS = "listen_status"

  const val TIMESTAMP = "timestamp"
  const val ORIGINATING_ADDRESS = "originating_address"
  const val STATUS = "status"

  const val SETUP_HANDLE = "setupHandle"
  const val BACKGROUND_HANDLE = "backgroundHandle"

  // Projections
  val DEFAULT_SMS_PROJECTION = listOf(Telephony.Sms._ID, Telephony.Sms.ADDRESS, Telephony.Sms.BODY, Telephony.Sms.DATE)
  val DEFAULT_CONVERSATION_PROJECTION = listOf(Telephony.Sms.Conversations.THREAD_ID ,Telephony.Sms.Conversations.SNIPPET, Telephony.Sms.Conversations.MESSAGE_COUNT)
  

  // Strings
  const val PERMISSION_DENIED = "permission_denied"
  const val PERMISSION_DENIED_MESSAGE = "Permission Request Denied By User."
  const val FAILED_FETCH = "failed_to_fetch_sms"
  const val ILLEGAL_ARGUMENT = "illegal_argument"
  const val WRONG_METHOD_TYPE = "Incorrect method called on channel."
  const val MESSAGE_OR_ADDRESS_CANNOT_BE_NULL = "Message body or Address cannot be null or blank."

  const val SMS_TO = "smsto:"
  const val SMS_BODY = "sms_body"
  
  // Shared Preferences
  const val SHARED_PREFERENCES_NAME = "com.shounakmulay.android_telephony_plugin"
  const val SHARED_PREFS_BACKGROUND_SETUP_HANDLE = "background_setup_handle"
  const val SHARED_PREFS_BACKGROUND_MESSAGE_HANDLE = "background_message_handle"

}