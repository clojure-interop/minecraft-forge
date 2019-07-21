(ns net.minecraftforge.event.entity.player.PlayerEvent$SaveToFile
  "The player is being saved to the world store. Note that the
  player may be in the process of logging out or otherwise departing
  from the world. Don't assume it's association with the world.
  This allows mods to load an additional file from the players directory
  containing additional mod related player data.

  Use this event to save the additional mod related player data to the world.


  WARNING: Do not overwrite the player's .dat file here. You will
  corrupt the world state."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerEvent$SaveToFile]))

(defn ->save-to-file
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  origin-directory - `java.io.File`
  player-uuid - `java.lang.String`"
  (^PlayerEvent$SaveToFile [^net.minecraft.entity.player.EntityPlayer player ^java.io.File origin-directory ^java.lang.String player-uuid]
    (new PlayerEvent$SaveToFile player origin-directory player-uuid)))

(defn get-player-file
  "Construct and return a recommended file for the supplied suffix

  suffix - The suffix to use. - `java.lang.String`

  returns: `java.io.File`"
  (^java.io.File [^PlayerEvent$SaveToFile this ^java.lang.String suffix]
    (-> this (.getPlayerFile suffix))))

(defn get-player-directory
  "The directory where player data is being stored. Use this
   to locate your mod additional file.

  returns: `java.io.File`"
  (^java.io.File [^PlayerEvent$SaveToFile this]
    (-> this (.getPlayerDirectory))))

(defn get-player-uuid
  "The UUID is the standard for player related file storage.
   It is broken out here for convenience for quick file generation.

  returns: `java.lang.String`"
  (^java.lang.String [^PlayerEvent$SaveToFile this]
    (-> this (.getPlayerUUID))))

