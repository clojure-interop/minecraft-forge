(ns net.minecraft.world.biome.Biome
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome Biome]))

(defn ->biome
  "Constructor.

  properties - `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^Biome [^net.minecraft.world.biome.Biome$BiomeProperties properties]
    (new Biome properties)))

(def *-exploration-biomes-list
  "Static Constant.

  type: java.util.Set<net.minecraft.world.biome.Biome>"
  Biome/EXPLORATION_BIOMES_LIST)

(def *-mutation-to-base-id-map
  "Static Constant.

  type: net.minecraft.util.ObjectIntIdentityMap<net.minecraft.world.biome.Biome>"
  Biome/MUTATION_TO_BASE_ID_MAP)

(def *-registry
  "Static Constant.

  type: net.minecraft.util.registry.RegistryNamespaced<net.minecraft.util.ResourceLocation,net.minecraft.world.biome.Biome>"
  Biome/REGISTRY)

(defn top-block
  "Instance Field.

  type: net.minecraft.block.state.IBlockState"
  (^net.minecraft.block.state.IBlockState [^Biome this]
    (-> this .-topBlock)))

(defn filler-block
  "Instance Field.

  type: net.minecraft.block.state.IBlockState"
  (^net.minecraft.block.state.IBlockState [^Biome this]
    (-> this .-fillerBlock)))

(defn the-biome-decorator
  "Instance Field.

  type: net.minecraft.world.biome.BiomeDecorator"
  (^net.minecraft.world.biome.BiomeDecorator [^Biome this]
    (-> this .-theBiomeDecorator)))

(defn *get-id-for-biome
  "biome - `net.minecraft.world.biome.Biome`

  returns: `int`"
  (^Integer [^net.minecraft.world.biome.Biome biome]
    (Biome/getIdForBiome biome)))

(defn *get-biome-for-id
  "id - `int`

  returns: `net.minecraft.world.biome.Biome`"
  (^net.minecraft.world.biome.Biome [^Integer id]
    (Biome/getBiomeForId id)))

(defn *get-mutation-for-biome
  "biome - `net.minecraft.world.biome.Biome`

  returns: `net.minecraft.world.biome.Biome`"
  (^net.minecraft.world.biome.Biome [^net.minecraft.world.biome.Biome biome]
    (Biome/getMutationForBiome biome)))

(defn *get-biome
  "biome-id - `int`
  fallback - `net.minecraft.world.biome.Biome`

  returns: `net.minecraft.world.biome.Biome`"
  (^net.minecraft.world.biome.Biome [^Integer biome-id ^net.minecraft.world.biome.Biome fallback]
    (Biome/getBiome biome-id fallback))
  (^net.minecraft.world.biome.Biome [^Integer id]
    (Biome/getBiome id)))

(defn *register-biomes
  ""
  ([]
    (Biome/registerBiomes )))

(defn *register-biome
  "id - `int`
  name - `java.lang.String`
  biome - `net.minecraft.world.biome.Biome`"
  ([^Integer id ^java.lang.String name ^net.minecraft.world.biome.Biome biome]
    (Biome/registerBiome id name biome)))

(defn get-grass-color-at-pos
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^Biome this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getGrassColorAtPos pos))))

(defn get-sky-color-by-temp
  "current-temperature - `float`

  returns: `int`"
  (^Integer [^Biome this ^Float current-temperature]
    (-> this (.getSkyColorByTemp current-temperature))))

(defn get-biome-name
  "returns: `java.lang.String`"
  (^java.lang.String [^Biome this]
    (-> this (.getBiomeName))))

(defn get-modded-biome-decorator
  "original - `net.minecraft.world.biome.BiomeDecorator`

  returns: `net.minecraft.world.biome.BiomeDecorator`"
  (^net.minecraft.world.biome.BiomeDecorator [^Biome this ^net.minecraft.world.biome.BiomeDecorator original]
    (-> this (.getModdedBiomeDecorator original))))

(defn get-modded-biome-foliage-color
  "original - `int`

  returns: `int`"
  (^Integer [^Biome this ^Integer original]
    (-> this (.getModdedBiomeFoliageColor original))))

(defn get-enable-snow?
  "returns: `boolean`"
  (^Boolean [^Biome this]
    (-> this (.getEnableSnow))))

(defn get-spawnable-list
  "creature-type - `net.minecraft.entity.EnumCreatureType`

  returns: `java.util.List<net.minecraft.world.biome.Biome$SpawnListEntry>`"
  (^java.util.List [^Biome this ^net.minecraft.entity.EnumCreatureType creature-type]
    (-> this (.getSpawnableList creature-type))))

(defn get-random-world-gen-for-grass
  "rand - `java.util.Random`

  returns: `net.minecraft.world.gen.feature.WorldGenerator`"
  (^net.minecraft.world.gen.feature.WorldGenerator [^Biome this ^java.util.Random rand]
    (-> this (.getRandomWorldGenForGrass rand))))

(defn get-water-color-multiplier
  "returns: `int`"
  (^Integer [^Biome this]
    (-> this (.getWaterColorMultiplier))))

(defn get-biome-class
  "returns: `java.lang.Class<? extends net.minecraft.world.biome.Biome>`"
  ([^Biome this]
    (-> this (.getBiomeClass))))

(defn gen-terrain-blocks
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  chunk-primer-in - `net.minecraft.world.chunk.ChunkPrimer`
  x - `int`
  z - `int`
  noise-val - `double`"
  ([^Biome this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.world.chunk.ChunkPrimer chunk-primer-in ^Integer x ^Integer z ^Double noise-val]
    (-> this (.genTerrainBlocks world-in rand chunk-primer-in x z noise-val))))

(defn get-temperature
  "returns: `float`"
  (^Float [^Biome this]
    (-> this (.getTemperature))))

(defn get-spawning-chance
  "returns: `float`"
  (^Float [^Biome this]
    (-> this (.getSpawningChance))))

(defn get-water-color
  "returns: `int`"
  (^Integer [^Biome this]
    (-> this (.getWaterColor))))

(defn high-humidity?
  "returns: `boolean`"
  (^Boolean [^Biome this]
    (-> this (.isHighHumidity))))

(defn gen-big-tree-chance
  "rand - `java.util.Random`

  returns: `net.minecraft.world.gen.feature.WorldGenAbstractTree`"
  (^net.minecraft.world.gen.feature.WorldGenAbstractTree [^Biome this ^java.util.Random rand]
    (-> this (.genBigTreeChance rand))))

(defn ignore-player-spawn-suitability
  "returns: `boolean`"
  (^Boolean [^Biome this]
    (-> this (.ignorePlayerSpawnSuitability))))

(defn snowy-biome?
  "returns: `boolean`"
  (^Boolean [^Biome this]
    (-> this (.isSnowyBiome))))

(defn add-default-flowers
  "Adds the default flowers, as of 1.7, it is 2 yellow, and 1 red. I chose 10 to allow some wiggle room in the numbers."
  ([^Biome this]
    (-> this (.addDefaultFlowers))))

(defn create-biome-decorator
  "returns: `net.minecraft.world.biome.BiomeDecorator`"
  (^net.minecraft.world.biome.BiomeDecorator [^Biome this]
    (-> this (.createBiomeDecorator))))

(defn generate-biome-terrain
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  chunk-primer-in - `net.minecraft.world.chunk.ChunkPrimer`
  x - `int`
  z - `int`
  noise-val - `double`"
  ([^Biome this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.world.chunk.ChunkPrimer chunk-primer-in ^Integer x ^Integer z ^Double noise-val]
    (-> this (.generateBiomeTerrain world-in rand chunk-primer-in x z noise-val))))

(defn get-temp-category
  "returns: `net.minecraft.world.biome.Biome$TempCategory`"
  (^net.minecraft.world.biome.Biome$TempCategory [^Biome this]
    (-> this (.getTempCategory))))

(defn plant-flower
  "world - `net.minecraft.world.World`
  rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`"
  ([^Biome this ^net.minecraft.world.World world ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos]
    (-> this (.plantFlower world rand pos))))

(defn get-height-variation
  "returns: `float`"
  (^Float [^Biome this]
    (-> this (.getHeightVariation))))

(defn pick-random-flower
  "rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.block.BlockFlower$EnumFlowerType`"
  (^net.minecraft.block.BlockFlower$EnumFlowerType [^Biome this ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos]
    (-> this (.pickRandomFlower rand pos))))

(defn can-rain?
  "returns: `boolean`"
  (^Boolean [^Biome this]
    (-> this (.canRain))))

(defn decorate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`"
  ([^Biome this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos]
    (-> this (.decorate world-in rand pos))))

(defn mutation?
  "returns: `boolean`"
  (^Boolean [^Biome this]
    (-> this (.isMutation))))

(defn get-modded-biome-grass-color
  "original - `int`

  returns: `int`"
  (^Integer [^Biome this ^Integer original]
    (-> this (.getModdedBiomeGrassColor original))))

(defn add-flower
  "Register a new plant to be planted when bonemeal is used on grass.

  state - The block to place. - `net.minecraft.block.state.IBlockState`
  weight - The weight of the plant, where red flowers are 10 and yellow flowers are 20. - `int`"
  ([^Biome this ^net.minecraft.block.state.IBlockState state ^Integer weight]
    (-> this (.addFlower state weight))))

(defn get-base-height
  "returns: `float`"
  (^Float [^Biome this]
    (-> this (.getBaseHeight))))

(defn get-rainfall
  "returns: `float`"
  (^Float [^Biome this]
    (-> this (.getRainfall))))

(defn get-float-temperature
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `float`"
  (^Float [^Biome this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getFloatTemperature pos))))

(defn get-foliage-color-at-pos
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^Biome this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getFoliageColorAtPos pos))))

