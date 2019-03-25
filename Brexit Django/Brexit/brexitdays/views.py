from django.shortcuts import render

from datetime import datetime


def index(request):

    brexit = datetime(2019, 3, 29, 23, 0, 0)
    diff = brexit - datetime.now()
    print(diff)
    return render(request, 'brexitdays/index.html', {'total_days': diff})
