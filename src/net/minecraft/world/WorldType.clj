(ns net.minecraft.world.WorldType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world WorldType]))

(defn ->world-type
  "Constructor.

  Creates a new world type, the ID is hidden and should not be referenced by modders.
   It will automatically expand the underlying workdType array if there are no IDs left.

  name - `java.lang.String`"
  (^WorldType [^java.lang.String name]
    (new WorldType name)))

(defn *-world-types
  "Static Field.

  type: net.minecraft.world.WorldType[]"
  []
  WorldType/WORLD_TYPES)

(def *-default
  "Static Constant.

  type: net.minecraft.world.WorldType"
  WorldType/DEFAULT)

(def *-flat
  "Static Constant.

  type: net.minecraft.world.WorldType"
  WorldType/FLAT)

(def *-large-biomes
  "Static Constant.

  type: net.minecraft.world.WorldType"
  WorldType/LARGE_BIOMES)

(def *-amplified
  "Static Constant.

  type: net.minecraft.world.WorldType"
  WorldType/AMPLIFIED)

(def *-customized
  "Static Constant.

  type: net.minecraft.world.WorldType"
  WorldType/CUSTOMIZED)

(def *-debug-world
  "Static Constant.

  type: net.minecraft.world.WorldType"
  WorldType/DEBUG_WORLD)

(def *-default-1-1
  "Static Constant.

  type: net.minecraft.world.WorldType"
  WorldType/DEFAULT_1_1)

(defn *parse-world-type
  "type - `java.lang.String`

  returns: `net.minecraft.world.WorldType`"
  (^net.minecraft.world.WorldType [^java.lang.String type]
    (WorldType/parseWorldType type)))

(defn show-world-info-notice
  "returns: `boolean`"
  (^Boolean [^WorldType this]
    (-> this (.showWorldInfoNotice))))

(defn get-horizon
  "world - `net.minecraft.world.World`

  returns: `double`"
  (^Double [^WorldType this ^net.minecraft.world.World world]
    (-> this (.getHorizon world))))

(defn get-generator-version
  "returns: `int`"
  (^Integer [^WorldType this]
    (-> this (.getGeneratorVersion))))

(defn get-biome-layer
  "Creates the GenLayerBiome used for generating the world with the specified ChunkProviderSettings JSON String
   *IF AND ONLY IF* this WorldType == WorldType.CUSTOMIZED.

  world-seed - The world seed - `long`
  parent-layer - The parent layer to feed into any layer you return - `net.minecraft.world.gen.layer.GenLayer`
  chunk-provider-settings - The ChunkProviderSettings constructed from the custom JSON - `net.minecraft.world.gen.ChunkProviderSettings`

  returns: A GenLayer that will return ints representing the Biomes to be generated, see GenLayerBiome - `net.minecraft.world.gen.layer.GenLayer`"
  (^net.minecraft.world.gen.layer.GenLayer [^WorldType this ^Long world-seed ^net.minecraft.world.gen.layer.GenLayer parent-layer ^net.minecraft.world.gen.ChunkProviderSettings chunk-provider-settings]
    (-> this (.getBiomeLayer world-seed parent-layer chunk-provider-settings))))

(defn get-chunk-generator
  "world - `net.minecraft.world.World`
  generator-options - `java.lang.String`

  returns: `net.minecraft.world.chunk.IChunkGenerator`"
  (^net.minecraft.world.chunk.IChunkGenerator [^WorldType this ^net.minecraft.world.World world ^java.lang.String generator-options]
    (-> this (.getChunkGenerator world generator-options))))

(defn on-customize-button
  "Called when the 'Customize' button is pressed on world creation GUI

  mc - The Minecraft instance - `net.minecraft.client.Minecraft`
  gui-create-world - the createworld GUI - `net.minecraft.client.gui.GuiCreateWorld`"
  ([^WorldType this ^net.minecraft.client.Minecraft mc ^net.minecraft.client.gui.GuiCreateWorld gui-create-world]
    (-> this (.onCustomizeButton mc gui-create-world))))

(defn get-spawn-fuzz
  "Gets the spawn fuzz for players who join the world.
   Useful for void world types.

  world - `net.minecraft.world.WorldServer`
  server - `net.minecraft.server.MinecraftServer`

  returns: Fuzz for entity initial spawn in blocks. - `int`"
  (^Integer [^WorldType this ^net.minecraft.world.WorldServer world ^net.minecraft.server.MinecraftServer server]
    (-> this (.getSpawnFuzz world server))))

(defn can-be-created?
  "returns: `boolean`"
  (^Boolean [^WorldType this]
    (-> this (.canBeCreated))))

(defn get-translate-name
  "returns: `java.lang.String`"
  (^java.lang.String [^WorldType this]
    (-> this (.getTranslateName))))

(defn handle-slime-spawn-reduction
  "random - `java.util.Random`
  world - `net.minecraft.world.World`

  returns: `boolean`"
  (^Boolean [^WorldType this ^java.util.Random random ^net.minecraft.world.World world]
    (-> this (.handleSlimeSpawnReduction random world))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^WorldType this]
    (-> this (.getName))))

(defn versioned?
  "returns: `boolean`"
  (^Boolean [^WorldType this]
    (-> this (.isVersioned))))

(defn get-translated-info
  "returns: `java.lang.String`"
  (^java.lang.String [^WorldType this]
    (-> this (.getTranslatedInfo))))

(defn get-cloud-height
  "Get the height to render the clouds for this world type

  returns: The height to render clouds at - `float`"
  (^Float [^WorldType this]
    (-> this (.getCloudHeight))))

(defn get-biome-provider
  "world - `net.minecraft.world.World`

  returns: `net.minecraft.world.biome.BiomeProvider`"
  (^net.minecraft.world.biome.BiomeProvider [^WorldType this ^net.minecraft.world.World world]
    (-> this (.getBiomeProvider world))))

(defn get-world-type-id
  "returns: `int`"
  (^Integer [^WorldType this]
    (-> this (.getWorldTypeID))))

(defn get-minimum-spawn-height
  "world - `net.minecraft.world.World`

  returns: `int`"
  (^Integer [^WorldType this ^net.minecraft.world.World world]
    (-> this (.getMinimumSpawnHeight world))))

(defn customizable?
  "Should world creation GUI show 'Customize' button for this world type?

  returns: if this world type has customization parameters - `boolean`"
  (^Boolean [^WorldType this]
    (-> this (.isCustomizable))))

(defn void-fade-magnitude
  "returns: `double`"
  (^Double [^WorldType this]
    (-> this (.voidFadeMagnitude))))

(defn on-gui-create-world-press
  "Called when 'Create New World' button is pressed before starting game"
  ([^WorldType this]
    (-> this (.onGUICreateWorldPress))))

(defn get-world-type-for-generator-version
  "version - `int`

  returns: `net.minecraft.world.WorldType`"
  (^net.minecraft.world.WorldType [^WorldType this ^Integer version]
    (-> this (.getWorldTypeForGeneratorVersion version))))

