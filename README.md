<h1>la documentation backend</h1>
<p>On doit ajouter les dependances JWT en meme version.
On ajoute la dependance openapi pour la documentation, la version 2.1.0 compatible seulement avec spring 3+
</p>

<h3>1. Se connecter au conteneur PostgreSQL</h3>
Utilisez la commande suivante pour accéder au conteneur :\
docker exec -it postgres-sql-smb bash\
Une fois dans le conteneur, connectez-vous à PostgreSQL avec psql :\
psql -U username -d social_media_book\
-U username : remplacez username par le nom d'utilisateur PostgreSQL configuré.\
-d social_media_book : le nom de la base de données.\