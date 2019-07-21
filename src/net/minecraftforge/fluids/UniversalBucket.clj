(ns net.minecraftforge.fluids.UniversalBucket
  "A universal bucket that can hold any liquid"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids UniversalBucket]))

(defn ->universal-bucket
  "Constructor.

  capacity - Capacity of the container - `int`
  empty - Item used for filling with the bucket event and returned when emptied - `net.minecraft.item.ItemStack`
  nbt-sensitive - Whether the empty item is NBT sensitive (usually true if empty and full are the same items) - `boolean`"
  (^UniversalBucket [^Integer capacity ^net.minecraft.item.ItemStack empty ^Boolean nbt-sensitive]
    (new UniversalBucket capacity empty nbt-sensitive))
  (^UniversalBucket []
    (new UniversalBucket )))

(defn *get-filled-bucket
  "item - `net.minecraftforge.fluids.UniversalBucket`
  fluid - `net.minecraftforge.fluids.Fluid`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^net.minecraftforge.fluids.UniversalBucket item ^net.minecraftforge.fluids.Fluid fluid]
    (UniversalBucket/getFilledBucket item fluid)))

(defn get-item-stack-display-name
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.lang.String`"
  (^java.lang.String [^UniversalBucket this ^net.minecraft.item.ItemStack stack]
    (-> this (.getItemStackDisplayName stack))))

(defn get-empty
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^UniversalBucket this]
    (-> this (.getEmpty))))

(defn get-container-item
  "Description copied from class: Item

  item-stack - The current ItemStack - `net.minecraft.item.ItemStack`

  returns: The resulting ItemStack - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^UniversalBucket this ^net.minecraft.item.ItemStack item-stack]
    (-> this (.getContainerItem item-stack))))

(defn on-item-right-click
  "world - `net.minecraft.world.World`
  player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.ActionResult [^UniversalBucket this ^net.minecraft.world.World world ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (-> this (.onItemRightClick world player hand))))

(defn get-capacity
  "returns: `int`"
  (^Integer [^UniversalBucket this]
    (-> this (.getCapacity))))

(defn has-container-item?
  "Description copied from class: Item

  stack - The current item stack - `net.minecraft.item.ItemStack`

  returns: True if this item has a 'container' - `boolean`"
  (^Boolean [^UniversalBucket this ^net.minecraft.item.ItemStack stack]
    (-> this (.hasContainerItem stack))))

(defn get-fluid
  "container - `net.minecraft.item.ItemStack`

  returns: `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^UniversalBucket this ^net.minecraft.item.ItemStack container]
    (-> this (.getFluid container))))

(defn get-sub-items
  "item-in - `net.minecraft.item.Item`
  tab - `net.minecraft.creativetab.CreativeTabs`
  sub-items - `net.minecraft.util.NonNullList`"
  ([^UniversalBucket this ^net.minecraft.item.Item item-in ^net.minecraft.creativetab.CreativeTabs tab ^net.minecraft.util.NonNullList sub-items]
    (-> this (.getSubItems item-in tab sub-items))))

(defn nbt-sensitive?
  "returns: `boolean`"
  (^Boolean [^UniversalBucket this]
    (-> this (.isNbtSensitive))))

(defn init-capabilities
  "Description copied from class: Item

  stack - The ItemStack - `net.minecraft.item.ItemStack`
  nbt - NBT of this item serialized, or null. - `net.minecraft.nbt.NBTTagCompound`

  returns: A holder instance associated with this ItemStack where you can hold capabilities for the life of this item. - `net.minecraftforge.common.capabilities.ICapabilityProvider`"
  (^net.minecraftforge.common.capabilities.ICapabilityProvider [^UniversalBucket this ^net.minecraft.item.ItemStack stack ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.initCapabilities stack nbt))))

(defn on-fill-bucket
  "event - `net.minecraftforge.event.entity.player.FillBucketEvent`"
  ([^UniversalBucket this ^net.minecraftforge.event.entity.player.FillBucketEvent event]
    (-> this (.onFillBucket event))))

