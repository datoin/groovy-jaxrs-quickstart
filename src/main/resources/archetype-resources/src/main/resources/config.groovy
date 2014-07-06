#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
config1 {
    list = ["test1", "test2"]
    enabled = true
}

mongodb {
    host = "localhost"
    port = 27017
    db = "db_name"
    collection = "collection_name"
    user = "user_name"
    password = "******"
}
