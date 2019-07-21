(ns net.minecraftforge.event.entity.player.PlayerEvent$NameFormat
  "NameFormat is fired when a player's display name is retrieved.
  This event is fired whenever a player's name is retrieved in
  EntityPlayer.getDisplayName() or EntityPlayer.refreshDisplayName().

  This event is fired via the ForgeEventFactory.getPlayerDisplayName(EntityPlayer, String).

  username contains the username of the player.
  displayname contains the display name of the player.

  This event is not Cancelable.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerEvent$NameFormat]))

(defn ->name-format
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  username - `java.lang.String`"
  (^PlayerEvent$NameFormat [^net.minecraft.entity.player.EntityPlayer player ^java.lang.String username]
    (new PlayerEvent$NameFormat player username)))

(defn get-username
  "returns: `java.lang.String`"
  (^java.lang.String [^PlayerEvent$NameFormat this]
    (-> this (.getUsername))))

(defn get-displayname
  "returns: `java.lang.String`"
  (^java.lang.String [^PlayerEvent$NameFormat this]
    (-> this (.getDisplayname))))

(defn set-displayname
  "displayname - `java.lang.String`"
  ([^PlayerEvent$NameFormat this ^java.lang.String displayname]
    (-> this (.setDisplayname displayname))))

