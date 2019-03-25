from django.conf.urls import url
from . import views

app_name = 'brexitdays'

urlpatterns = [
    url('^', views.index, name='index')
]
