(ns net.minecraftforge.event.world.BlockEvent$HarvestDropsEvent
  "Fired when a block is about to drop it's harvested items. The drops array can be amended, as can the dropChance.
  Note well: the harvester player field is null in a variety of scenarios. Code expecting null.

  The dropChance is used to determine which items in this array will actually drop, compared to a random number. If you wish, you
  can pre-filter yourself, and set dropChance to 1.0f to always drop the contents of the drops array.

  isSilkTouching is set if this is considered a silk touch harvesting operation, vs a normal harvesting operation. Act accordingly."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world BlockEvent$HarvestDropsEvent]))

(defn ->harvest-drops-event
  "Constructor.

  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  fortune-level - `int`
  drop-chance - `float`
  drops - `java.util.List`
  harvester - `net.minecraft.entity.player.EntityPlayer`
  is-silk-touching - `boolean`"
  (^BlockEvent$HarvestDropsEvent [^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^Integer fortune-level ^Float drop-chance ^java.util.List drops ^net.minecraft.entity.player.EntityPlayer harvester ^Boolean is-silk-touching]
    (new BlockEvent$HarvestDropsEvent world pos state fortune-level drop-chance drops harvester is-silk-touching)))

(defn get-fortune-level
  "returns: `int`"
  (^Integer [^BlockEvent$HarvestDropsEvent this]
    (-> this (.getFortuneLevel))))

(defn get-drops
  "returns: `java.util.List<net.minecraft.item.ItemStack>`"
  (^java.util.List [^BlockEvent$HarvestDropsEvent this]
    (-> this (.getDrops))))

(defn silk-touching?
  "returns: `boolean`"
  (^Boolean [^BlockEvent$HarvestDropsEvent this]
    (-> this (.isSilkTouching))))

(defn get-drop-chance
  "returns: `float`"
  (^Float [^BlockEvent$HarvestDropsEvent this]
    (-> this (.getDropChance))))

(defn set-drop-chance
  "drop-chance - `float`"
  ([^BlockEvent$HarvestDropsEvent this ^Float drop-chance]
    (-> this (.setDropChance drop-chance))))

(defn get-harvester
  "returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^BlockEvent$HarvestDropsEvent this]
    (-> this (.getHarvester))))

