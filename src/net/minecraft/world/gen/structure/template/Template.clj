(ns net.minecraft.world.gen.structure.template.Template
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure.template Template]))

(defn ->template
  "Constructor."
  (^Template []
    (new Template )))

(defn *transformed-block-pos
  "placement-in - `net.minecraft.world.gen.structure.template.PlacementSettings`
  p-186266-1 - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^net.minecraft.world.gen.structure.template.PlacementSettings placement-in ^net.minecraft.util.math.BlockPos p-186266-1]
    (Template/transformedBlockPos placement-in p-186266-1)))

(defn *get-zero-position-with-transform
  "p-191157-0 - `net.minecraft.util.math.BlockPos`
  p-191157-1 - `net.minecraft.util.Mirror`
  p-191157-2 - `net.minecraft.util.Rotation`
  p-191157-3 - `int`
  p-191157-4 - `int`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^net.minecraft.util.math.BlockPos p-191157-0 ^net.minecraft.util.Mirror p-191157-1 ^net.minecraft.util.Rotation p-191157-2 ^Integer p-191157-3 ^Integer p-191157-4]
    (Template/getZeroPositionWithTransform p-191157-0 p-191157-1 p-191157-2 p-191157-3 p-191157-4)))

(defn *register-fixes
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (Template/registerFixes fixer)))

(defn write-to-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^Template this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.writeToNBT nbt))))

(defn get-author
  "returns: `java.lang.String`"
  (^java.lang.String [^Template this]
    (-> this (.getAuthor))))

(defn set-author
  "author-in - `java.lang.String`"
  ([^Template this ^java.lang.String author-in]
    (-> this (.setAuthor author-in))))

(defn get-zero-position-with-transform
  "p-189961-1 - `net.minecraft.util.math.BlockPos`
  p-189961-2 - `net.minecraft.util.Mirror`
  p-189961-3 - `net.minecraft.util.Rotation`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^Template this ^net.minecraft.util.math.BlockPos p-189961-1 ^net.minecraft.util.Mirror p-189961-2 ^net.minecraft.util.Rotation p-189961-3]
    (-> this (.getZeroPositionWithTransform p-189961-1 p-189961-2 p-189961-3))))

(defn read
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^Template this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.read compound))))

(defn calculate-connected-pos
  "placement-in - `net.minecraft.world.gen.structure.template.PlacementSettings`
  p-186262-2 - `net.minecraft.util.math.BlockPos`
  p-186262-3 - `net.minecraft.world.gen.structure.template.PlacementSettings`
  p-186262-4 - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^Template this ^net.minecraft.world.gen.structure.template.PlacementSettings placement-in ^net.minecraft.util.math.BlockPos p-186262-2 ^net.minecraft.world.gen.structure.template.PlacementSettings p-186262-3 ^net.minecraft.util.math.BlockPos p-186262-4]
    (-> this (.calculateConnectedPos placement-in p-186262-2 p-186262-3 p-186262-4))))

(defn take-blocks-from-world
  "world-in - `net.minecraft.world.World`
  start-pos - `net.minecraft.util.math.BlockPos`
  end-pos - `net.minecraft.util.math.BlockPos`
  take-entities - `boolean`
  to-ignore - `net.minecraft.block.Block`"
  ([^Template this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos start-pos ^net.minecraft.util.math.BlockPos end-pos ^Boolean take-entities ^net.minecraft.block.Block to-ignore]
    (-> this (.takeBlocksFromWorld world-in start-pos end-pos take-entities to-ignore))))

(defn add-blocks-to-world
  "p-189960-1 - `net.minecraft.world.World`
  p-189960-2 - `net.minecraft.util.math.BlockPos`
  p-189960-3 - `net.minecraft.world.gen.structure.template.ITemplateProcessor`
  p-189960-4 - `net.minecraft.world.gen.structure.template.PlacementSettings`
  p-189960-5 - `int`"
  ([^Template this ^net.minecraft.world.World p-189960-1 ^net.minecraft.util.math.BlockPos p-189960-2 ^net.minecraft.world.gen.structure.template.ITemplateProcessor p-189960-3 ^net.minecraft.world.gen.structure.template.PlacementSettings p-189960-4 ^Integer p-189960-5]
    (-> this (.addBlocksToWorld p-189960-1 p-189960-2 p-189960-3 p-189960-4 p-189960-5)))
  ([^Template this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.world.gen.structure.template.PlacementSettings placement-in ^Integer flags]
    (-> this (.addBlocksToWorld world-in pos placement-in flags)))
  ([^Template this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.world.gen.structure.template.PlacementSettings placement-in]
    (-> this (.addBlocksToWorld world-in pos placement-in))))

(defn get-data-blocks
  "pos - `net.minecraft.util.math.BlockPos`
  placement-in - `net.minecraft.world.gen.structure.template.PlacementSettings`

  returns: `java.util.Map<net.minecraft.util.math.BlockPos,java.lang.String>`"
  (^java.util.Map [^Template this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.world.gen.structure.template.PlacementSettings placement-in]
    (-> this (.getDataBlocks pos placement-in))))

(defn add-blocks-to-world-chunk
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  placement-in - `net.minecraft.world.gen.structure.template.PlacementSettings`"
  ([^Template this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.world.gen.structure.template.PlacementSettings placement-in]
    (-> this (.addBlocksToWorldChunk world-in pos placement-in))))

(defn get-size
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^Template this]
    (-> this (.getSize))))

(defn transformed-size
  "rotation-in - `net.minecraft.util.Rotation`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^Template this ^net.minecraft.util.Rotation rotation-in]
    (-> this (.transformedSize rotation-in))))

