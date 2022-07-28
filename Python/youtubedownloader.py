from pytube import YouTube
from slugify import slugify 



url = input("Ingrese la URL del video: ")
while(url):
    yt = YouTube(url)
    title = slugify(yt.title, separator=" ", regex_pattern = r'[^-a-z0-9%]+')
    filename = yt.title + ".mp3"
    try:
        yt.streams.filter(progressive=False, abr='160kbps').first().download(filename=filename)
    except OSError:
        title = slugify(yt.title, separator=" ", regex_pattern = r'[^-a-z0-9%]+').title()
        filename = title + ".mp3"
        yt.streams.filter(progressive=False, abr='160kbps').first().download(filename=filename)
    except AttributeError:
        yt.streams.filter(progressive=False, abr='128kbps').first().download(filename=filename)
    print("Descarga realizada con exito! \n")
    url = input("Ingrese la URL del video: ")