(ns net.minecraft.tileentity.TileEntityStructure
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityStructure]))

(defn ->tile-entity-structure
  "Constructor."
  (^TileEntityStructure []
    (new TileEntityStructure )))

(defn set-show-bounding-box
  "show-bounding-box-in - `boolean`"
  ([^TileEntityStructure this ^Boolean show-bounding-box-in]
    (-> this (.setShowBoundingBox show-bounding-box-in))))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityStructure this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn get-mode
  "returns: `net.minecraft.tileentity.TileEntityStructure$Mode`"
  (^net.minecraft.tileentity.TileEntityStructure$Mode [^TileEntityStructure this]
    (-> this (.getMode))))

(defn save
  "p-189712-1 - `boolean`

  returns: `boolean`"
  (^Boolean [^TileEntityStructure this ^Boolean p-189712-1]
    (-> this (.save p-189712-1)))
  (^Boolean [^TileEntityStructure this]
    (-> this (.save))))

(defn next-mode
  ""
  ([^TileEntityStructure this]
    (-> this (.nextMode))))

(defn read-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^TileEntityStructure this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readFromNBT compound))))

(defn set-powered
  "powered-in - `boolean`"
  ([^TileEntityStructure this ^Boolean powered-in]
    (-> this (.setPowered powered-in))))

(defn set-position
  "pos-in - `net.minecraft.util.math.BlockPos`"
  ([^TileEntityStructure this ^net.minecraft.util.math.BlockPos pos-in]
    (-> this (.setPosition pos-in))))

(defn set-mode
  "mode-in - `net.minecraft.tileentity.TileEntityStructure$Mode`"
  ([^TileEntityStructure this ^net.minecraft.tileentity.TileEntityStructure$Mode mode-in]
    (-> this (.setMode mode-in))))

(defn get-integrity
  "returns: `float`"
  (^Float [^TileEntityStructure this]
    (-> this (.getIntegrity))))

(defn load
  "p-189714-1 - `boolean`

  returns: `boolean`"
  (^Boolean [^TileEntityStructure this ^Boolean p-189714-1]
    (-> this (.load p-189714-1)))
  (^Boolean [^TileEntityStructure this]
    (-> this (.load))))

(defn set-seed
  "seed-in - `long`"
  ([^TileEntityStructure this ^Long seed-in]
    (-> this (.setSeed seed-in))))

(defn get-position
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^TileEntityStructure this]
    (-> this (.getPosition))))

(defn write-coordinates
  "buf - `io.netty.buffer.ByteBuf`"
  ([^TileEntityStructure this ^io.netty.buffer.ByteBuf buf]
    (-> this (.writeCoordinates buf))))

(defn set-mirror
  "mirror-in - `net.minecraft.util.Mirror`"
  ([^TileEntityStructure this ^net.minecraft.util.Mirror mirror-in]
    (-> this (.setMirror mirror-in))))

(defn used-by
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^TileEntityStructure this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.usedBy player))))

(defn powered?
  "returns: `boolean`"
  (^Boolean [^TileEntityStructure this]
    (-> this (.isPowered))))

(defn set-name
  "name-in - `java.lang.String`"
  ([^TileEntityStructure this ^java.lang.String name-in]
    (-> this (.setName name-in))))

(defn get-update-tag
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityStructure this]
    (-> this (.getUpdateTag))))

(defn created-by
  "p-189720-1 - `net.minecraft.entity.EntityLivingBase`"
  ([^TileEntityStructure this ^net.minecraft.entity.EntityLivingBase p-189720-1]
    (-> this (.createdBy p-189720-1))))

(defn get-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^TileEntityStructure this]
    (-> this (.getDisplayName))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^TileEntityStructure this]
    (-> this (.getName))))

(defn get-update-packet
  "returns: `net.minecraft.network.play.server.SPacketUpdateTileEntity`"
  (^net.minecraft.network.play.server.SPacketUpdateTileEntity [^TileEntityStructure this]
    (-> this (.getUpdatePacket))))

(defn ignores-entities
  "returns: `boolean`"
  (^Boolean [^TileEntityStructure this]
    (-> this (.ignoresEntities))))

(defn set-integrity
  "integrity-in - `float`"
  ([^TileEntityStructure this ^Float integrity-in]
    (-> this (.setIntegrity integrity-in))))

(defn set-rotation
  "rotation-in - `net.minecraft.util.Rotation`"
  ([^TileEntityStructure this ^net.minecraft.util.Rotation rotation-in]
    (-> this (.setRotation rotation-in))))

(defn unload-structure
  ""
  ([^TileEntityStructure this]
    (-> this (.unloadStructure))))

(defn shows-bounding-box
  "returns: `boolean`"
  (^Boolean [^TileEntityStructure this]
    (-> this (.showsBoundingBox))))

(defn get-mirror
  "returns: `net.minecraft.util.Mirror`"
  (^net.minecraft.util.Mirror [^TileEntityStructure this]
    (-> this (.getMirror))))

(defn get-rotation
  "returns: `net.minecraft.util.Rotation`"
  (^net.minecraft.util.Rotation [^TileEntityStructure this]
    (-> this (.getRotation))))

(defn structure-loadable?
  "returns: `boolean`"
  (^Boolean [^TileEntityStructure this]
    (-> this (.isStructureLoadable))))

(defn set-size
  "size-in - `net.minecraft.util.math.BlockPos`"
  ([^TileEntityStructure this ^net.minecraft.util.math.BlockPos size-in]
    (-> this (.setSize size-in))))

(defn set-show-air
  "show-air-in - `boolean`"
  ([^TileEntityStructure this ^Boolean show-air-in]
    (-> this (.setShowAir show-air-in))))

(defn get-structure-size
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^TileEntityStructure this]
    (-> this (.getStructureSize))))

(defn get-metadata
  "returns: `java.lang.String`"
  (^java.lang.String [^TileEntityStructure this]
    (-> this (.getMetadata))))

(defn get-seed
  "returns: `long`"
  (^Long [^TileEntityStructure this]
    (-> this (.getSeed))))

(defn shows-air
  "returns: `boolean`"
  (^Boolean [^TileEntityStructure this]
    (-> this (.showsAir))))

(defn set-ignores-entities
  "ignore-entities-in - `boolean`"
  ([^TileEntityStructure this ^Boolean ignore-entities-in]
    (-> this (.setIgnoresEntities ignore-entities-in))))

(defn set-metadata
  "metadata-in - `java.lang.String`"
  ([^TileEntityStructure this ^java.lang.String metadata-in]
    (-> this (.setMetadata metadata-in))))

(defn detect-size
  "returns: `boolean`"
  (^Boolean [^TileEntityStructure this]
    (-> this (.detectSize))))

