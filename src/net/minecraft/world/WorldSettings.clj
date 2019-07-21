(ns net.minecraft.world.WorldSettings
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world WorldSettings]))

(defn ->world-settings
  "Constructor.

  seed-in - `long`
  game-type - `net.minecraft.world.GameType`
  enable-map-features - `boolean`
  hardcore-mode - `boolean`
  world-type-in - `net.minecraft.world.WorldType`"
  (^WorldSettings [^Long seed-in ^net.minecraft.world.GameType game-type ^Boolean enable-map-features ^Boolean hardcore-mode ^net.minecraft.world.WorldType world-type-in]
    (new WorldSettings seed-in game-type enable-map-features hardcore-mode world-type-in))
  (^WorldSettings [^net.minecraft.world.storage.WorldInfo info]
    (new WorldSettings info)))

(defn *get-game-type-by-id
  "id - `int`

  returns: `net.minecraft.world.GameType`"
  (^net.minecraft.world.GameType [^Integer id]
    (WorldSettings/getGameTypeById id)))

(defn enable-bonus-chest
  "returns: `net.minecraft.world.WorldSettings`"
  (^net.minecraft.world.WorldSettings [^WorldSettings this]
    (-> this (.enableBonusChest))))

(defn map-features-enabled?
  "returns: `boolean`"
  (^Boolean [^WorldSettings this]
    (-> this (.isMapFeaturesEnabled))))

(defn set-generator-options
  "options - `java.lang.String`

  returns: `net.minecraft.world.WorldSettings`"
  (^net.minecraft.world.WorldSettings [^WorldSettings this ^java.lang.String options]
    (-> this (.setGeneratorOptions options))))

(defn get-generator-options
  "returns: `java.lang.String`"
  (^java.lang.String [^WorldSettings this]
    (-> this (.getGeneratorOptions))))

(defn get-hardcore-enabled?
  "returns: `boolean`"
  (^Boolean [^WorldSettings this]
    (-> this (.getHardcoreEnabled))))

(defn enable-commands
  "returns: `net.minecraft.world.WorldSettings`"
  (^net.minecraft.world.WorldSettings [^WorldSettings this]
    (-> this (.enableCommands))))

(defn get-game-type
  "returns: `net.minecraft.world.GameType`"
  (^net.minecraft.world.GameType [^WorldSettings this]
    (-> this (.getGameType))))

(defn are-commands-allowed
  "returns: `boolean`"
  (^Boolean [^WorldSettings this]
    (-> this (.areCommandsAllowed))))

(defn get-terrain-type
  "returns: `net.minecraft.world.WorldType`"
  (^net.minecraft.world.WorldType [^WorldSettings this]
    (-> this (.getTerrainType))))

(defn get-seed
  "returns: `long`"
  (^Long [^WorldSettings this]
    (-> this (.getSeed))))

(defn bonus-chest-enabled?
  "returns: `boolean`"
  (^Boolean [^WorldSettings this]
    (-> this (.isBonusChestEnabled))))

