(ns net.minecraft.world.chunk.EmptyChunk
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.chunk EmptyChunk]))

(defn ->empty-chunk
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `int`
  z - `int`"
  (^EmptyChunk [^net.minecraft.world.World world-in ^Integer x ^Integer z]
    (new EmptyChunk world-in x z)))

(defn get-light-subtracted
  "pos - `net.minecraft.util.math.BlockPos`
  amount - `int`

  returns: `int`"
  (^Integer [^EmptyChunk this ^net.minecraft.util.math.BlockPos pos ^Integer amount]
    (-> this (.getLightSubtracted pos amount))))

(defn get-entities-within-aabb-for-entity
  "entity-in - `net.minecraft.entity.Entity`
  aabb - `net.minecraft.util.math.AxisAlignedBB`
  list-to-fill - `java.util.List`
  p-177414-4 - `com.google.common.base.Predicate`"
  ([^EmptyChunk this ^net.minecraft.entity.Entity entity-in ^net.minecraft.util.math.AxisAlignedBB aabb ^java.util.List list-to-fill ^com.google.common.base.Predicate p-177414-4]
    (-> this (.getEntitiesWithinAABBForEntity entity-in aabb list-to-fill p-177414-4))))

(defn get-tile-entity
  "pos - `net.minecraft.util.math.BlockPos`
  p-177424-2 - `net.minecraft.world.chunk.Chunk$EnumCreateEntityType`

  returns: `net.minecraft.tileentity.TileEntity`"
  (^net.minecraft.tileentity.TileEntity [^EmptyChunk this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.world.chunk.Chunk$EnumCreateEntityType p-177424-2]
    (-> this (.getTileEntity pos p-177424-2))))

(defn needs-saving
  "p-76601-1 - `boolean`

  returns: `boolean`"
  (^Boolean [^EmptyChunk this ^Boolean p-76601-1]
    (-> this (.needsSaving p-76601-1))))

(defn remove-tile-entity
  "pos - `net.minecraft.util.math.BlockPos`"
  ([^EmptyChunk this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.removeTileEntity pos))))

(defn get-block-state
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^EmptyChunk this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBlockState pos))))

(defn get-random-with-seed
  "seed - `long`

  returns: `java.util.Random`"
  (^java.util.Random [^EmptyChunk this ^Long seed]
    (-> this (.getRandomWithSeed seed))))

(defn set-chunk-modified
  ""
  ([^EmptyChunk this]
    (-> this (.setChunkModified))))

(defn get-height-value
  "x - `int`
  z - `int`

  returns: `int`"
  (^Integer [^EmptyChunk this ^Integer x ^Integer z]
    (-> this (.getHeightValue x z))))

(defn on-chunk-load
  ""
  ([^EmptyChunk this]
    (-> this (.onChunkLoad))))

(defn generate-skylight-map
  ""
  ([^EmptyChunk this]
    (-> this (.generateSkylightMap))))

(defn add-entity
  "entity-in - `net.minecraft.entity.Entity`"
  ([^EmptyChunk this ^net.minecraft.entity.Entity entity-in]
    (-> this (.addEntity entity-in))))

(defn add-tile-entity
  "pos - `net.minecraft.util.math.BlockPos`
  tile-entity-in - `net.minecraft.tileentity.TileEntity`"
  ([^EmptyChunk this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.tileentity.TileEntity tile-entity-in]
    (-> this (.addTileEntity pos tile-entity-in)))
  ([^EmptyChunk this ^net.minecraft.tileentity.TileEntity tile-entity-in]
    (-> this (.addTileEntity tile-entity-in))))

(defn get-block-light-opacity
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^EmptyChunk this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBlockLightOpacity pos))))

(defn get-entities-of-type-within-aaab
  "entity-class - `java.lang.Class`
  aabb - `net.minecraft.util.math.AxisAlignedBB`
  list-to-fill - `java.util.List`
  filter - `com.google.common.base.Predicate`

  returns: `<T extends net.minecraft.entity.Entity> void`"
  ([^EmptyChunk this ^java.lang.Class entity-class ^net.minecraft.util.math.AxisAlignedBB aabb ^java.util.List list-to-fill ^com.google.common.base.Predicate filter]
    (-> this (.getEntitiesOfTypeWithinAAAB entity-class aabb list-to-fill filter))))

(defn on-chunk-unload
  ""
  ([^EmptyChunk this]
    (-> this (.onChunkUnload))))

(defn get-are-levels-empty?
  "start-y - `int`
  end-y - `int`

  returns: `boolean`"
  (^Boolean [^EmptyChunk this ^Integer start-y ^Integer end-y]
    (-> this (.getAreLevelsEmpty start-y end-y))))

(defn remove-entity
  "entity-in - `net.minecraft.entity.Entity`"
  ([^EmptyChunk this ^net.minecraft.entity.Entity entity-in]
    (-> this (.removeEntity entity-in))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^EmptyChunk this]
    (-> this (.isEmpty))))

(defn can-see-sky?
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^EmptyChunk this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canSeeSky pos))))

(defn generate-height-map
  ""
  ([^EmptyChunk this]
    (-> this (.generateHeightMap))))

(defn set-light-for
  "p-177431-1 - `net.minecraft.world.EnumSkyBlock`
  pos - `net.minecraft.util.math.BlockPos`
  value - `int`"
  ([^EmptyChunk this ^net.minecraft.world.EnumSkyBlock p-177431-1 ^net.minecraft.util.math.BlockPos pos ^Integer value]
    (-> this (.setLightFor p-177431-1 pos value))))

(defn at-location?
  "x - `int`
  z - `int`

  returns: `boolean`"
  (^Boolean [^EmptyChunk this ^Integer x ^Integer z]
    (-> this (.isAtLocation x z))))

(defn remove-entity-at-index
  "entity-in - `net.minecraft.entity.Entity`
  index - `int`"
  ([^EmptyChunk this ^net.minecraft.entity.Entity entity-in ^Integer index]
    (-> this (.removeEntityAtIndex entity-in index))))

(defn get-light-for
  "p-177413-1 - `net.minecraft.world.EnumSkyBlock`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^EmptyChunk this ^net.minecraft.world.EnumSkyBlock p-177413-1 ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getLightFor p-177413-1 pos))))

