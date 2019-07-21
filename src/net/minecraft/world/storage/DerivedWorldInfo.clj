(ns net.minecraft.world.storage.DerivedWorldInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage DerivedWorldInfo]))

(defn ->derived-world-info
  "Constructor.

  world-info-in - `net.minecraft.world.storage.WorldInfo`"
  (^DerivedWorldInfo [^net.minecraft.world.storage.WorldInfo world-info-in]
    (new DerivedWorldInfo world-info-in)))

(defn set-rain-time
  "time - `int`"
  ([^DerivedWorldInfo this ^Integer time]
    (-> this (.setRainTime time))))

(defn set-thundering
  "thundering-in - `boolean`"
  ([^DerivedWorldInfo this ^Boolean thundering-in]
    (-> this (.setThundering thundering-in))))

(defn set-difficulty-locked
  "locked - `boolean`"
  ([^DerivedWorldInfo this ^Boolean locked]
    (-> this (.setDifficultyLocked locked))))

(defn get-save-version
  "returns: `int`"
  (^Integer [^DerivedWorldInfo this]
    (-> this (.getSaveVersion))))

(defn raining?
  "returns: `boolean`"
  (^Boolean [^DerivedWorldInfo this]
    (-> this (.isRaining))))

(defn set-save-version
  "version - `int`"
  ([^DerivedWorldInfo this ^Integer version]
    (-> this (.setSaveVersion version))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^DerivedWorldInfo this]
    (-> this (.isInitialized))))

(defn set-allow-commands
  "allow - `boolean`"
  ([^DerivedWorldInfo this ^Boolean allow]
    (-> this (.setAllowCommands allow))))

(defn map-features-enabled?
  "returns: `boolean`"
  (^Boolean [^DerivedWorldInfo this]
    (-> this (.isMapFeaturesEnabled))))

(defn set-raining
  "is-raining - `boolean`"
  ([^DerivedWorldInfo this ^Boolean is-raining]
    (-> this (.setRaining is-raining))))

(defn set-difficulty
  "new-difficulty - `net.minecraft.world.EnumDifficulty`"
  ([^DerivedWorldInfo this ^net.minecraft.world.EnumDifficulty new-difficulty]
    (-> this (.setDifficulty new-difficulty))))

(defn hardcore-mode-enabled?
  "returns: `boolean`"
  (^Boolean [^DerivedWorldInfo this]
    (-> this (.isHardcoreModeEnabled))))

(defn set-spawn-y
  "y - `int`"
  ([^DerivedWorldInfo this ^Integer y]
    (-> this (.setSpawnY y))))

(defn set-server-initialized
  "initialized-in - `boolean`"
  ([^DerivedWorldInfo this ^Boolean initialized-in]
    (-> this (.setServerInitialized initialized-in))))

(defn clone-nbt-compound
  "nbt - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^DerivedWorldInfo this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.cloneNBTCompound nbt))))

(defn set-spawn-x
  "x - `int`"
  ([^DerivedWorldInfo this ^Integer x]
    (-> this (.setSpawnX x))))

(defn get-world-time
  "returns: `long`"
  (^Long [^DerivedWorldInfo this]
    (-> this (.getWorldTime))))

(defn get-spawn-x
  "returns: `int`"
  (^Integer [^DerivedWorldInfo this]
    (-> this (.getSpawnX))))

(defn set-terrain-type
  "type - `net.minecraft.world.WorldType`"
  ([^DerivedWorldInfo this ^net.minecraft.world.WorldType type]
    (-> this (.setTerrainType type))))

(defn set-world-time
  "time - `long`"
  ([^DerivedWorldInfo this ^Long time]
    (-> this (.setWorldTime time))))

(defn set-world-total-time
  "time - `long`"
  ([^DerivedWorldInfo this ^Long time]
    (-> this (.setWorldTotalTime time))))

(defn thundering?
  "returns: `boolean`"
  (^Boolean [^DerivedWorldInfo this]
    (-> this (.isThundering))))

(defn get-game-type
  "returns: `net.minecraft.world.GameType`"
  (^net.minecraft.world.GameType [^DerivedWorldInfo this]
    (-> this (.getGameType))))

(defn get-size-on-disk
  "returns: `long`"
  (^Long [^DerivedWorldInfo this]
    (-> this (.getSizeOnDisk))))

(defn are-commands-allowed
  "returns: `boolean`"
  (^Boolean [^DerivedWorldInfo this]
    (-> this (.areCommandsAllowed))))

(defn get-player-nbt-tag-compound
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^DerivedWorldInfo this]
    (-> this (.getPlayerNBTTagCompound))))

(defn get-spawn-z
  "returns: `int`"
  (^Integer [^DerivedWorldInfo this]
    (-> this (.getSpawnZ))))

(defn get-world-name
  "returns: `java.lang.String`"
  (^java.lang.String [^DerivedWorldInfo this]
    (-> this (.getWorldName))))

(defn get-game-rules-instance
  "returns: `net.minecraft.world.GameRules`"
  (^net.minecraft.world.GameRules [^DerivedWorldInfo this]
    (-> this (.getGameRulesInstance))))

(defn get-terrain-type
  "returns: `net.minecraft.world.WorldType`"
  (^net.minecraft.world.WorldType [^DerivedWorldInfo this]
    (-> this (.getTerrainType))))

(defn difficulty-locked?
  "returns: `boolean`"
  (^Boolean [^DerivedWorldInfo this]
    (-> this (.isDifficultyLocked))))

(defn set-world-name
  "world-name - `java.lang.String`"
  ([^DerivedWorldInfo this ^java.lang.String world-name]
    (-> this (.setWorldName world-name))))

(defn get-seed
  "returns: `long`"
  (^Long [^DerivedWorldInfo this]
    (-> this (.getSeed))))

(defn set-spawn-z
  "z - `int`"
  ([^DerivedWorldInfo this ^Integer z]
    (-> this (.setSpawnZ z))))

(defn get-spawn-y
  "returns: `int`"
  (^Integer [^DerivedWorldInfo this]
    (-> this (.getSpawnY))))

(defn get-dimension-data
  "dimension-in - `net.minecraft.world.DimensionType`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^DerivedWorldInfo this ^net.minecraft.world.DimensionType dimension-in]
    (-> this (.getDimensionData dimension-in))))

(defn get-difficulty
  "returns: `net.minecraft.world.EnumDifficulty`"
  (^net.minecraft.world.EnumDifficulty [^DerivedWorldInfo this]
    (-> this (.getDifficulty))))

(defn set-spawn
  "spawn-point - `net.minecraft.util.math.BlockPos`"
  ([^DerivedWorldInfo this ^net.minecraft.util.math.BlockPos spawn-point]
    (-> this (.setSpawn spawn-point))))

(defn set-thunder-time
  "time - `int`"
  ([^DerivedWorldInfo this ^Integer time]
    (-> this (.setThunderTime time))))

(defn get-rain-time
  "returns: `int`"
  (^Integer [^DerivedWorldInfo this]
    (-> this (.getRainTime))))

(defn get-last-time-played
  "returns: `long`"
  (^Long [^DerivedWorldInfo this]
    (-> this (.getLastTimePlayed))))

(defn set-dimension-data
  "dimension-in - `net.minecraft.world.DimensionType`
  compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^DerivedWorldInfo this ^net.minecraft.world.DimensionType dimension-in ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.setDimensionData dimension-in compound))))

(defn get-thunder-time
  "returns: `int`"
  (^Integer [^DerivedWorldInfo this]
    (-> this (.getThunderTime))))

(defn get-world-total-time
  "returns: `long`"
  (^Long [^DerivedWorldInfo this]
    (-> this (.getWorldTotalTime))))

