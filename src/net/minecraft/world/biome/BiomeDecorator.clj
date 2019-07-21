(ns net.minecraft.world.biome.BiomeDecorator
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeDecorator]))

(defn ->biome-decorator
  "Constructor."
  (^BiomeDecorator []
    (new BiomeDecorator )))

(defn decorating
  "Instance Field.

  type: boolean"
  (^Boolean [^BiomeDecorator this]
    (-> this .-decorating)))

(defn chunk-pos
  "Instance Field.

  type: net.minecraft.util.math.BlockPos"
  (^net.minecraft.util.math.BlockPos [^BiomeDecorator this]
    (-> this .-chunkPos)))

(defn chunk-provider-settings
  "Instance Field.

  type: net.minecraft.world.gen.ChunkProviderSettings"
  (^net.minecraft.world.gen.ChunkProviderSettings [^BiomeDecorator this]
    (-> this .-chunkProviderSettings)))

(defn clay-gen
  "Instance Field.

  type: net.minecraft.world.gen.feature.WorldGenerator"
  (^net.minecraft.world.gen.feature.WorldGenerator [^BiomeDecorator this]
    (-> this .-clayGen)))

(defn sand-gen
  "Instance Field.

  type: net.minecraft.world.gen.feature.WorldGenerator"
  (^net.minecraft.world.gen.feature.WorldGenerator [^BiomeDecorator this]
    (-> this .-sandGen)))

(defn gravel-as-sand-gen
  "Instance Field.

  type: net.minecraft.world.gen.feature.WorldGenerator"
  (^net.minecraft.world.gen.feature.WorldGenerator [^BiomeDecorator this]
    (-> this .-gravelAsSandGen)))

(defn dirt-gen
  "Instance Field.

  type: net.minecraft.world.gen.feature.WorldGenerator"
  (^net.minecraft.world.gen.feature.WorldGenerator [^BiomeDecorator this]
    (-> this .-dirtGen)))

(defn gravel-gen
  "Instance Field.

  type: net.minecraft.world.gen.feature.WorldGenerator"
  (^net.minecraft.world.gen.feature.WorldGenerator [^BiomeDecorator this]
    (-> this .-gravelGen)))

(defn granite-gen
  "Instance Field.

  type: net.minecraft.world.gen.feature.WorldGenerator"
  (^net.minecraft.world.gen.feature.WorldGenerator [^BiomeDecorator this]
    (-> this .-graniteGen)))

(defn diorite-gen
  "Instance Field.

  type: net.minecraft.world.gen.feature.WorldGenerator"
  (^net.minecraft.world.gen.feature.WorldGenerator [^BiomeDecorator this]
    (-> this .-dioriteGen)))

(defn andesite-gen
  "Instance Field.

  type: net.minecraft.world.gen.feature.WorldGenerator"
  (^net.minecraft.world.gen.feature.WorldGenerator [^BiomeDecorator this]
    (-> this .-andesiteGen)))

(defn coal-gen
  "Instance Field.

  type: net.minecraft.world.gen.feature.WorldGenerator"
  (^net.minecraft.world.gen.feature.WorldGenerator [^BiomeDecorator this]
    (-> this .-coalGen)))

(defn iron-gen
  "Instance Field.

  type: net.minecraft.world.gen.feature.WorldGenerator"
  (^net.minecraft.world.gen.feature.WorldGenerator [^BiomeDecorator this]
    (-> this .-ironGen)))

(defn gold-gen
  "Instance Field.

  type: net.minecraft.world.gen.feature.WorldGenerator"
  (^net.minecraft.world.gen.feature.WorldGenerator [^BiomeDecorator this]
    (-> this .-goldGen)))

(defn redstone-gen
  "Instance Field.

  type: net.minecraft.world.gen.feature.WorldGenerator"
  (^net.minecraft.world.gen.feature.WorldGenerator [^BiomeDecorator this]
    (-> this .-redstoneGen)))

(defn diamond-gen
  "Instance Field.

  type: net.minecraft.world.gen.feature.WorldGenerator"
  (^net.minecraft.world.gen.feature.WorldGenerator [^BiomeDecorator this]
    (-> this .-diamondGen)))

(defn lapis-gen
  "Instance Field.

  type: net.minecraft.world.gen.feature.WorldGenerator"
  (^net.minecraft.world.gen.feature.WorldGenerator [^BiomeDecorator this]
    (-> this .-lapisGen)))

(defn yellow-flower-gen
  "Instance Field.

  type: net.minecraft.world.gen.feature.WorldGenFlowers"
  (^net.minecraft.world.gen.feature.WorldGenFlowers [^BiomeDecorator this]
    (-> this .-yellowFlowerGen)))

(defn mushroom-brown-gen
  "Instance Field.

  type: net.minecraft.world.gen.feature.WorldGenerator"
  (^net.minecraft.world.gen.feature.WorldGenerator [^BiomeDecorator this]
    (-> this .-mushroomBrownGen)))

(defn mushroom-red-gen
  "Instance Field.

  type: net.minecraft.world.gen.feature.WorldGenerator"
  (^net.minecraft.world.gen.feature.WorldGenerator [^BiomeDecorator this]
    (-> this .-mushroomRedGen)))

(defn big-mushroom-gen
  "Instance Field.

  type: net.minecraft.world.gen.feature.WorldGenerator"
  (^net.minecraft.world.gen.feature.WorldGenerator [^BiomeDecorator this]
    (-> this .-bigMushroomGen)))

(defn reed-gen
  "Instance Field.

  type: net.minecraft.world.gen.feature.WorldGenerator"
  (^net.minecraft.world.gen.feature.WorldGenerator [^BiomeDecorator this]
    (-> this .-reedGen)))

(defn cactus-gen
  "Instance Field.

  type: net.minecraft.world.gen.feature.WorldGenerator"
  (^net.minecraft.world.gen.feature.WorldGenerator [^BiomeDecorator this]
    (-> this .-cactusGen)))

(defn waterlily-gen
  "Instance Field.

  type: net.minecraft.world.gen.feature.WorldGenerator"
  (^net.minecraft.world.gen.feature.WorldGenerator [^BiomeDecorator this]
    (-> this .-waterlilyGen)))

(defn waterlily-per-chunk
  "Instance Field.

  type: int"
  (^Integer [^BiomeDecorator this]
    (-> this .-waterlilyPerChunk)))

(defn trees-per-chunk
  "Instance Field.

  type: int"
  (^Integer [^BiomeDecorator this]
    (-> this .-treesPerChunk)))

(defn extra-tree-chance
  "Instance Field.

  type: float"
  (^Float [^BiomeDecorator this]
    (-> this .-extraTreeChance)))

(defn flowers-per-chunk
  "Instance Field.

  type: int"
  (^Integer [^BiomeDecorator this]
    (-> this .-flowersPerChunk)))

(defn grass-per-chunk
  "Instance Field.

  type: int"
  (^Integer [^BiomeDecorator this]
    (-> this .-grassPerChunk)))

(defn dead-bush-per-chunk
  "Instance Field.

  type: int"
  (^Integer [^BiomeDecorator this]
    (-> this .-deadBushPerChunk)))

(defn mushrooms-per-chunk
  "Instance Field.

  type: int"
  (^Integer [^BiomeDecorator this]
    (-> this .-mushroomsPerChunk)))

(defn reeds-per-chunk
  "Instance Field.

  type: int"
  (^Integer [^BiomeDecorator this]
    (-> this .-reedsPerChunk)))

(defn cacti-per-chunk
  "Instance Field.

  type: int"
  (^Integer [^BiomeDecorator this]
    (-> this .-cactiPerChunk)))

(defn sand-per-chunk
  "Instance Field.

  type: int"
  (^Integer [^BiomeDecorator this]
    (-> this .-sandPerChunk)))

(defn sand-per-chunk-2
  "Instance Field.

  type: int"
  (^Integer [^BiomeDecorator this]
    (-> this .-sandPerChunk2)))

(defn clay-per-chunk
  "Instance Field.

  type: int"
  (^Integer [^BiomeDecorator this]
    (-> this .-clayPerChunk)))

(defn big-mushrooms-per-chunk
  "Instance Field.

  type: int"
  (^Integer [^BiomeDecorator this]
    (-> this .-bigMushroomsPerChunk)))

(defn generate-lakes
  "Instance Field.

  type: boolean"
  (^Boolean [^BiomeDecorator this]
    (-> this .-generateLakes)))

(defn decorate
  "world-in - `net.minecraft.world.World`
  random - `java.util.Random`
  biome - `net.minecraft.world.biome.Biome`
  pos - `net.minecraft.util.math.BlockPos`"
  ([^BiomeDecorator this ^net.minecraft.world.World world-in ^java.util.Random random ^net.minecraft.world.biome.Biome biome ^net.minecraft.util.math.BlockPos pos]
    (-> this (.decorate world-in random biome pos))))

