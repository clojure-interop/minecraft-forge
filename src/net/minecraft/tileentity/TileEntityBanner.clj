(ns net.minecraft.tileentity.TileEntityBanner
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityBanner]))

(defn ->tile-entity-banner
  "Constructor."
  (^TileEntityBanner []
    (new TileEntityBanner )))

(defn *get-patterns
  "stack - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^net.minecraft.item.ItemStack stack]
    (TileEntityBanner/getPatterns stack)))

(defn *remove-banner-data
  "stack - `net.minecraft.item.ItemStack`"
  ([^net.minecraft.item.ItemStack stack]
    (TileEntityBanner/removeBannerData stack)))

(defn *get-color
  "p-190616-0 - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.EnumDyeColor`"
  (^net.minecraft.item.EnumDyeColor [^net.minecraft.item.ItemStack p-190616-0]
    (TileEntityBanner/getColor p-190616-0)))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityBanner this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn read-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^TileEntityBanner this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readFromNBT compound))))

(defn get-item
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^TileEntityBanner this]
    (-> this (.getItem))))

(defn get-update-tag
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityBanner this]
    (-> this (.getUpdateTag))))

(defn get-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^TileEntityBanner this]
    (-> this (.getDisplayName))))

(defn get-pattern-resource-location
  "returns: `java.lang.String`"
  (^java.lang.String [^TileEntityBanner this]
    (-> this (.getPatternResourceLocation))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^TileEntityBanner this]
    (-> this (.getName))))

(defn set-item-values
  "stack - `net.minecraft.item.ItemStack`
  p-175112-2 - `boolean`"
  ([^TileEntityBanner this ^net.minecraft.item.ItemStack stack ^Boolean p-175112-2]
    (-> this (.setItemValues stack p-175112-2))))

(defn get-update-packet
  "returns: `net.minecraft.network.play.server.SPacketUpdateTileEntity`"
  (^net.minecraft.network.play.server.SPacketUpdateTileEntity [^TileEntityBanner this]
    (-> this (.getUpdatePacket))))

(defn get-pattern-list
  "returns: `java.util.List<net.minecraft.tileentity.BannerPattern>`"
  (^java.util.List [^TileEntityBanner this]
    (-> this (.getPatternList))))

(defn has-custom-name?
  "returns: `boolean`"
  (^Boolean [^TileEntityBanner this]
    (-> this (.hasCustomName))))

(defn get-color-list
  "returns: `java.util.List<net.minecraft.item.EnumDyeColor>`"
  (^java.util.List [^TileEntityBanner this]
    (-> this (.getColorList))))

