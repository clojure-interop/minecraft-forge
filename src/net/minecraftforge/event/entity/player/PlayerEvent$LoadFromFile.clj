(ns net.minecraftforge.event.entity.player.PlayerEvent$LoadFromFile
  "The player is being loaded from the world save. Note that the
  player won't have been added to the world yet. Intended to
  allow mods to load an additional file from the players directory
  containing additional mod related player data."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerEvent$LoadFromFile]))

(defn ->load-from-file
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  origin-directory - `java.io.File`
  player-uuid - `java.lang.String`"
  (^PlayerEvent$LoadFromFile [^net.minecraft.entity.player.EntityPlayer player ^java.io.File origin-directory ^java.lang.String player-uuid]
    (new PlayerEvent$LoadFromFile player origin-directory player-uuid)))

(defn get-player-file
  "Construct and return a recommended file for the supplied suffix

  suffix - The suffix to use. - `java.lang.String`

  returns: `java.io.File`"
  (^java.io.File [^PlayerEvent$LoadFromFile this ^java.lang.String suffix]
    (-> this (.getPlayerFile suffix))))

(defn get-player-directory
  "The directory where player data is being stored. Use this
   to locate your mod additional file.

  returns: `java.io.File`"
  (^java.io.File [^PlayerEvent$LoadFromFile this]
    (-> this (.getPlayerDirectory))))

(defn get-player-uuid
  "The UUID is the standard for player related file storage.
   It is broken out here for convenience for quick file generation.

  returns: `java.lang.String`"
  (^java.lang.String [^PlayerEvent$LoadFromFile this]
    (-> this (.getPlayerUUID))))

