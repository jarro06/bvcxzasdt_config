 
listView('bvcxzasdt Jobs') {
    description('bvcxzasdt Jobs')
    jobs {
        regex('bvcxzasdt_.+')
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
