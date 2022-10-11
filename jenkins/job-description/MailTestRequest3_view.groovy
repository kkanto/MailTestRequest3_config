 
listView('MailTestRequest3 Jobs') {
    description('MailTestRequest3 Jobs')
    jobs {
        regex('MailTestRequest3_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
