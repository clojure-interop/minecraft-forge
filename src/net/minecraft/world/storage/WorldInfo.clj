(ns net.minecraft.world.storage.WorldInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage WorldInfo]))

(defn ->world-info
  "Constructor.

  settings - `net.minecraft.world.WorldSettings`
  name - `java.lang.String`"
  (^WorldInfo [^net.minecraft.world.WorldSettings settings ^java.lang.String name]
    (new WorldInfo settings name))
  (^WorldInfo [^net.minecraft.nbt.NBTTagCompound nbt]
    (new WorldInfo nbt)))

(def *-default-difficulty
  "Static Constant.

  type: net.minecraft.world.EnumDifficulty"
  WorldInfo/DEFAULT_DIFFICULTY)

(defn *register-fixes
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (WorldInfo/registerFixes fixer)))

(defn get-border-warning-time
  "returns: `int`"
  (^Integer [^WorldInfo this]
    (-> this (.getBorderWarningTime))))

(defn set-rain-time
  "time - `int`"
  ([^WorldInfo this ^Integer time]
    (-> this (.setRainTime time))))

(defn get-border-lerp-time
  "returns: `long`"
  (^Long [^WorldInfo this]
    (-> this (.getBorderLerpTime))))

(defn set-thundering
  "thundering-in - `boolean`"
  ([^WorldInfo this ^Boolean thundering-in]
    (-> this (.setThundering thundering-in))))

(defn set-difficulty-locked
  "locked - `boolean`"
  ([^WorldInfo this ^Boolean locked]
    (-> this (.setDifficultyLocked locked))))

(defn get-save-version
  "returns: `int`"
  (^Integer [^WorldInfo this]
    (-> this (.getSaveVersion))))

(defn raining?
  "returns: `boolean`"
  (^Boolean [^WorldInfo this]
    (-> this (.isRaining))))

(defn set-save-version
  "version - `int`"
  ([^WorldInfo this ^Integer version]
    (-> this (.setSaveVersion version))))

(defn get-border-size
  "returns: `double`"
  (^Double [^WorldInfo this]
    (-> this (.getBorderSize))))

(defn set-border-safe-zone
  "amount - `double`"
  ([^WorldInfo this ^Double amount]
    (-> this (.setBorderSafeZone amount))))

(defn set-border-lerp-time
  "time - `long`"
  ([^WorldInfo this ^Long time]
    (-> this (.setBorderLerpTime time))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^WorldInfo this]
    (-> this (.isInitialized))))

(defn set-hardcore
  "hardcore-in - `boolean`"
  ([^WorldInfo this ^Boolean hardcore-in]
    (-> this (.setHardcore hardcore-in))))

(defn populate-from-world-settings
  "settings - `net.minecraft.world.WorldSettings`"
  ([^WorldInfo this ^net.minecraft.world.WorldSettings settings]
    (-> this (.populateFromWorldSettings settings))))

(defn get-clean-weather-time
  "returns: `int`"
  (^Integer [^WorldInfo this]
    (-> this (.getCleanWeatherTime))))

(defn set-allow-commands
  "allow - `boolean`"
  ([^WorldInfo this ^Boolean allow]
    (-> this (.setAllowCommands allow))))

(defn map-features-enabled?
  "returns: `boolean`"
  (^Boolean [^WorldInfo this]
    (-> this (.isMapFeaturesEnabled))))

(defn set-raining
  "is-raining - `boolean`"
  ([^WorldInfo this ^Boolean is-raining]
    (-> this (.setRaining is-raining))))

(defn set-difficulty
  "new-difficulty - `net.minecraft.world.EnumDifficulty`"
  ([^WorldInfo this ^net.minecraft.world.EnumDifficulty new-difficulty]
    (-> this (.setDifficulty new-difficulty))))

(defn hardcore-mode-enabled?
  "returns: `boolean`"
  (^Boolean [^WorldInfo this]
    (-> this (.isHardcoreModeEnabled))))

(defn set-border-lerp-target
  "lerp-size - `double`"
  ([^WorldInfo this ^Double lerp-size]
    (-> this (.setBorderLerpTarget lerp-size))))

(defn set-spawn-y
  "y - `int`"
  ([^WorldInfo this ^Integer y]
    (-> this (.setSpawnY y))))

(defn get-border-damage-per-block
  "returns: `double`"
  (^Double [^WorldInfo this]
    (-> this (.getBorderDamagePerBlock))))

(defn set-border-size
  "size - `double`"
  ([^WorldInfo this ^Double size]
    (-> this (.setBorderSize size))))

(defn set-server-initialized
  "initialized-in - `boolean`"
  ([^WorldInfo this ^Boolean initialized-in]
    (-> this (.setServerInitialized initialized-in))))

(defn clone-nbt-compound
  "nbt - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^WorldInfo this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.cloneNBTCompound nbt))))

(defn set-spawn-x
  "x - `int`"
  ([^WorldInfo this ^Integer x]
    (-> this (.setSpawnX x))))

(defn get-version-name
  "returns: `java.lang.String`"
  (^java.lang.String [^WorldInfo this]
    (-> this (.getVersionName))))

(defn get-generator-options
  "returns: `java.lang.String`"
  (^java.lang.String [^WorldInfo this]
    (-> this (.getGeneratorOptions))))

(defn set-map-features-enabled
  "enabled - `boolean`"
  ([^WorldInfo this ^Boolean enabled]
    (-> this (.setMapFeaturesEnabled enabled))))

(defn set-border-damage-per-block
  "damage - `double`"
  ([^WorldInfo this ^Double damage]
    (-> this (.setBorderDamagePerBlock damage))))

(defn get-world-time
  "returns: `long`"
  (^Long [^WorldInfo this]
    (-> this (.getWorldTime))))

(defn get-spawn-x
  "returns: `int`"
  (^Integer [^WorldInfo this]
    (-> this (.getSpawnX))))

(defn set-terrain-type
  "type - `net.minecraft.world.WorldType`"
  ([^WorldInfo this ^net.minecraft.world.WorldType type]
    (-> this (.setTerrainType type))))

(defn set-world-time
  "time - `long`"
  ([^WorldInfo this ^Long time]
    (-> this (.setWorldTime time))))

(defn set-game-type
  "type - `net.minecraft.world.GameType`"
  ([^WorldInfo this ^net.minecraft.world.GameType type]
    (-> this (.setGameType type))))

(defn get-border-safe-zone
  "returns: `double`"
  (^Double [^WorldInfo this]
    (-> this (.getBorderSafeZone))))

(defn set-world-total-time
  "time - `long`"
  ([^WorldInfo this ^Long time]
    (-> this (.setWorldTotalTime time))))

(defn get-border-center-x
  "pos-x - `double`"
  ([^WorldInfo this ^Double pos-x]
    (-> this (.getBorderCenterX pos-x)))
  (^Double [^WorldInfo this]
    (-> this (.getBorderCenterX))))

(defn thundering?
  "returns: `boolean`"
  (^Boolean [^WorldInfo this]
    (-> this (.isThundering))))

(defn get-game-type
  "returns: `net.minecraft.world.GameType`"
  (^net.minecraft.world.GameType [^WorldInfo this]
    (-> this (.getGameType))))

(defn get-size-on-disk
  "returns: `long`"
  (^Long [^WorldInfo this]
    (-> this (.getSizeOnDisk))))

(defn set-clean-weather-time
  "clean-weather-time-in - `int`"
  ([^WorldInfo this ^Integer clean-weather-time-in]
    (-> this (.setCleanWeatherTime clean-weather-time-in))))

(defn are-commands-allowed
  "returns: `boolean`"
  (^Boolean [^WorldInfo this]
    (-> this (.areCommandsAllowed))))

(defn get-player-nbt-tag-compound
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^WorldInfo this]
    (-> this (.getPlayerNBTTagCompound))))

(defn get-border-warning-distance
  "returns: `int`"
  (^Integer [^WorldInfo this]
    (-> this (.getBorderWarningDistance))))

(defn get-spawn-z
  "returns: `int`"
  (^Integer [^WorldInfo this]
    (-> this (.getSpawnZ))))

(defn get-border-lerp-target
  "returns: `double`"
  (^Double [^WorldInfo this]
    (-> this (.getBorderLerpTarget))))

(defn get-additional-property
  "additional-property - `java.lang.String`

  returns: `net.minecraft.nbt.NBTBase`"
  (^net.minecraft.nbt.NBTBase [^WorldInfo this ^java.lang.String additional-property]
    (-> this (.getAdditionalProperty additional-property))))

(defn version-snapshot?
  "returns: `boolean`"
  (^Boolean [^WorldInfo this]
    (-> this (.isVersionSnapshot))))

(defn get-world-name
  "returns: `java.lang.String`"
  (^java.lang.String [^WorldInfo this]
    (-> this (.getWorldName))))

(defn set-additional-properties
  "Allow access to additional mod specific world based properties
   Used by FML to store mod list associated with a world, and maybe an id map
   Used by Forge to store the dimensions available to a world

  additional-properties - `java.util.Map`"
  ([^WorldInfo this ^java.util.Map additional-properties]
    (-> this (.setAdditionalProperties additional-properties))))

(defn set-border-warning-time
  "ticks - `int`"
  ([^WorldInfo this ^Integer ticks]
    (-> this (.setBorderWarningTime ticks))))

(defn get-border-center-z
  "pos-z - `double`"
  ([^WorldInfo this ^Double pos-z]
    (-> this (.getBorderCenterZ pos-z)))
  (^Double [^WorldInfo this]
    (-> this (.getBorderCenterZ))))

(defn get-game-rules-instance
  "returns: `net.minecraft.world.GameRules`"
  (^net.minecraft.world.GameRules [^WorldInfo this]
    (-> this (.getGameRulesInstance))))

(defn get-terrain-type
  "returns: `net.minecraft.world.WorldType`"
  (^net.minecraft.world.WorldType [^WorldInfo this]
    (-> this (.getTerrainType))))

(defn difficulty-locked?
  "returns: `boolean`"
  (^Boolean [^WorldInfo this]
    (-> this (.isDifficultyLocked))))

(defn set-world-name
  "world-name - `java.lang.String`"
  ([^WorldInfo this ^java.lang.String world-name]
    (-> this (.setWorldName world-name))))

(defn get-seed
  "returns: `long`"
  (^Long [^WorldInfo this]
    (-> this (.getSeed))))

(defn set-spawn-z
  "z - `int`"
  ([^WorldInfo this ^Integer z]
    (-> this (.setSpawnZ z))))

(defn get-spawn-y
  "returns: `int`"
  (^Integer [^WorldInfo this]
    (-> this (.getSpawnY))))

(defn get-dimension-data
  "dimension-in - `net.minecraft.world.DimensionType`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^WorldInfo this ^net.minecraft.world.DimensionType dimension-in]
    (-> this (.getDimensionData dimension-in))))

(defn add-to-crash-report
  "category - `net.minecraft.crash.CrashReportCategory`"
  ([^WorldInfo this ^net.minecraft.crash.CrashReportCategory category]
    (-> this (.addToCrashReport category))))

(defn get-difficulty
  "returns: `net.minecraft.world.EnumDifficulty`"
  (^net.minecraft.world.EnumDifficulty [^WorldInfo this]
    (-> this (.getDifficulty))))

(defn set-spawn
  "spawn-point - `net.minecraft.util.math.BlockPos`"
  ([^WorldInfo this ^net.minecraft.util.math.BlockPos spawn-point]
    (-> this (.setSpawn spawn-point))))

(defn set-border-warning-distance
  "amount-of-blocks - `int`"
  ([^WorldInfo this ^Integer amount-of-blocks]
    (-> this (.setBorderWarningDistance amount-of-blocks))))

(defn set-thunder-time
  "time - `int`"
  ([^WorldInfo this ^Integer time]
    (-> this (.setThunderTime time))))

(defn get-rain-time
  "returns: `int`"
  (^Integer [^WorldInfo this]
    (-> this (.getRainTime))))

(defn get-last-time-played
  "returns: `long`"
  (^Long [^WorldInfo this]
    (-> this (.getLastTimePlayed))))

(defn set-dimension-data
  "dimension-in - `net.minecraft.world.DimensionType`
  compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^WorldInfo this ^net.minecraft.world.DimensionType dimension-in ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.setDimensionData dimension-in compound))))

(defn get-version-id
  "returns: `int`"
  (^Integer [^WorldInfo this]
    (-> this (.getVersionId))))

(defn get-thunder-time
  "returns: `int`"
  (^Integer [^WorldInfo this]
    (-> this (.getThunderTime))))

(defn get-world-total-time
  "returns: `long`"
  (^Long [^WorldInfo this]
    (-> this (.getWorldTotalTime))))

