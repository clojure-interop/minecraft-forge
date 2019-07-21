(ns net.minecraft.block.state.IBlockProperties
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.state IBlockProperties]))

(defn get-selected-bounding-box
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^IBlockProperties this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getSelectedBoundingBox world-in pos))))

(defn get-render-type
  "returns: `net.minecraft.util.EnumBlockRenderType`"
  (^net.minecraft.util.EnumBlockRenderType [^IBlockProperties this]
    (-> this (.getRenderType))))

(defn use-neighbor-brightness
  "returns: `boolean`"
  (^Boolean [^IBlockProperties this]
    (-> this (.useNeighborBrightness))))

(defn fully-opaque?
  "Deprecated.

  returns: `boolean`"
  (^Boolean [^IBlockProperties this]
    (-> this (.isFullyOpaque))))

(defn get-map-color
  "returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^IBlockProperties this]
    (-> this (.getMapColor))))

(defn full-block?
  "returns: `boolean`"
  (^Boolean [^IBlockProperties this]
    (-> this (.isFullBlock))))

(defn has-custom-breaking-progress?
  "returns: `boolean`"
  (^Boolean [^IBlockProperties this]
    (-> this (.hasCustomBreakingProgress))))

(defn has-comparator-input-override?
  "returns: `boolean`"
  (^Boolean [^IBlockProperties this]
    (-> this (.hasComparatorInputOverride))))

(defn get-weak-power
  "block-access - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`

  returns: `int`"
  (^Integer [^IBlockProperties this ^net.minecraft.world.IBlockAccess block-access ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.getWeakPower block-access pos side))))

(defn with-mirror
  "mirror-in - `net.minecraft.util.Mirror`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^IBlockProperties this ^net.minecraft.util.Mirror mirror-in]
    (-> this (.withMirror mirror-in))))

(defn get-mobility-flag
  "returns: `net.minecraft.block.material.EnumPushReaction`"
  (^net.minecraft.block.material.EnumPushReaction [^IBlockProperties this]
    (-> this (.getMobilityFlag))))

(defn translucent?
  "returns: `boolean`"
  (^Boolean [^IBlockProperties this]
    (-> this (.isTranslucent))))

(defn block-normal-cube?
  "returns: `boolean`"
  (^Boolean [^IBlockProperties this]
    (-> this (.isBlockNormalCube))))

(defn get-light-value
  "world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^IBlockProperties this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getLightValue world pos)))
  (^Integer [^IBlockProperties this]
    (-> this (.getLightValue))))

(defn collision-ray-trace
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  start - `net.minecraft.util.math.Vec3d`
  end - `net.minecraft.util.math.Vec3d`

  returns: `net.minecraft.util.math.RayTraceResult`"
  (^net.minecraft.util.math.RayTraceResult [^IBlockProperties this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.math.Vec3d start ^net.minecraft.util.math.Vec3d end]
    (-> this (.collisionRayTrace world-in pos start end))))

(defn full-cube?
  "returns: `boolean`"
  (^Boolean [^IBlockProperties this]
    (-> this (.isFullCube))))

(defn get-offset
  "access - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^IBlockProperties this ^net.minecraft.world.IBlockAccess access ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getOffset access pos))))

(defn does-side-block-rendering
  "world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^IBlockProperties this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.doesSideBlockRendering world pos side))))

(defn should-side-be-rendered?
  "block-access - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  facing - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^IBlockProperties this ^net.minecraft.world.IBlockAccess block-access ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing facing]
    (-> this (.shouldSideBeRendered block-access pos facing))))

(defn can-provide-power?
  "returns: `boolean`"
  (^Boolean [^IBlockProperties this]
    (-> this (.canProvidePower))))

(defn opaque-cube?
  "returns: `boolean`"
  (^Boolean [^IBlockProperties this]
    (-> this (.isOpaqueCube))))

(defn normal-cube?
  "returns: `boolean`"
  (^Boolean [^IBlockProperties this]
    (-> this (.isNormalCube))))

(defn causes-suffocation
  "returns: `boolean`"
  (^Boolean [^IBlockProperties this]
    (-> this (.causesSuffocation))))

(defn get-material
  "returns: `net.minecraft.block.material.Material`"
  (^net.minecraft.block.material.Material [^IBlockProperties this]
    (-> this (.getMaterial))))

(defn get-player-relative-block-hardness
  "player - `net.minecraft.entity.player.EntityPlayer`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `float`"
  (^Float [^IBlockProperties this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getPlayerRelativeBlockHardness player world-in pos))))

(defn get-ambient-occlusion-light-value
  "returns: `float`"
  (^Float [^IBlockProperties this]
    (-> this (.getAmbientOcclusionLightValue))))

(defn get-packed-lightmap-coords
  "source - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^IBlockProperties this ^net.minecraft.world.IBlockAccess source ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getPackedLightmapCoords source pos))))

(defn can-entity-spawn?
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^IBlockProperties this ^net.minecraft.entity.Entity entity-in]
    (-> this (.canEntitySpawn entity-in))))

(defn get-collision-bounding-box
  "world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^IBlockProperties this ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getCollisionBoundingBox world-in pos))))

(defn get-actual-state
  "block-access - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^IBlockProperties this ^net.minecraft.world.IBlockAccess block-access ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getActualState block-access pos))))

(defn side-solid?
  "world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^IBlockProperties this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.isSideSolid world pos side))))

(defn get-bounding-box
  "block-access - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^IBlockProperties this ^net.minecraft.world.IBlockAccess block-access ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBoundingBox block-access pos))))

(defn with-rotation
  "rot - `net.minecraft.util.Rotation`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^IBlockProperties this ^net.minecraft.util.Rotation rot]
    (-> this (.withRotation rot))))

(defn get-block-hardness
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `float`"
  (^Float [^IBlockProperties this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBlockHardness world-in pos))))

(defn get-light-opacity
  "world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^IBlockProperties this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getLightOpacity world pos)))
  (^Integer [^IBlockProperties this]
    (-> this (.getLightOpacity))))

(defn get-comparator-input-override
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^IBlockProperties this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getComparatorInputOverride world-in pos))))

(defn add-collision-box-to-list
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  entity-box - `net.minecraft.util.math.AxisAlignedBB`
  colliding-boxes - `java.util.List`
  entity-in - `net.minecraft.entity.Entity`
  p-185908-6 - `boolean`"
  ([^IBlockProperties this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.math.AxisAlignedBB entity-box ^java.util.List colliding-boxes ^net.minecraft.entity.Entity entity-in ^Boolean p-185908-6]
    (-> this (.addCollisionBoxToList world-in pos entity-box colliding-boxes entity-in p-185908-6))))

(defn get-strong-power
  "block-access - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`

  returns: `int`"
  (^Integer [^IBlockProperties this ^net.minecraft.world.IBlockAccess block-access ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.getStrongPower block-access pos side))))

