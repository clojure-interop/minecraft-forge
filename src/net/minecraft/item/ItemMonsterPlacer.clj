(ns net.minecraft.item.ItemMonsterPlacer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemMonsterPlacer]))

(defn ->item-monster-placer
  "Constructor."
  (^ItemMonsterPlacer []
    (new ItemMonsterPlacer )))

(defn *apply-item-entity-data-to-entity
  "entity-world - `net.minecraft.world.World`
  player - `net.minecraft.entity.player.EntityPlayer`
  stack - `net.minecraft.item.ItemStack`
  target-entity - `net.minecraft.entity.Entity`"
  ([^net.minecraft.world.World entity-world ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.Entity target-entity]
    (ItemMonsterPlacer/applyItemEntityDataToEntity entity-world player stack target-entity)))

(defn *spawn-creature
  "world-in - `net.minecraft.world.World`
  entity-id - `net.minecraft.util.ResourceLocation`
  x - `double`
  y - `double`
  z - `double`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^net.minecraft.world.World world-in ^net.minecraft.util.ResourceLocation entity-id ^Double x ^Double y ^Double z]
    (ItemMonsterPlacer/spawnCreature world-in entity-id x y z)))

(defn *apply-entity-id-to-item-stack
  "stack - `net.minecraft.item.ItemStack`
  entity-id - `net.minecraft.util.ResourceLocation`"
  ([^net.minecraft.item.ItemStack stack ^net.minecraft.util.ResourceLocation entity-id]
    (ItemMonsterPlacer/applyEntityIdToItemStack stack entity-id)))

(defn *get-named-id-from
  "p-190908-0 - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^net.minecraft.item.ItemStack p-190908-0]
    (ItemMonsterPlacer/getNamedIdFrom p-190908-0)))

(defn get-item-stack-display-name
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.lang.String`"
  (^java.lang.String [^ItemMonsterPlacer this ^net.minecraft.item.ItemStack stack]
    (-> this (.getItemStackDisplayName stack))))

(defn on-item-use
  "player - `net.minecraft.entity.player.EntityPlayer`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  hand - `net.minecraft.util.EnumHand`
  facing - `net.minecraft.util.EnumFacing`
  hit-x - `float`
  hit-y - `float`
  hit-z - `float`

  returns: `net.minecraft.util.EnumActionResult`"
  (^net.minecraft.util.EnumActionResult [^ItemMonsterPlacer this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumHand hand ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z]
    (-> this (.onItemUse player world-in pos hand facing hit-x hit-y hit-z))))

(defn on-item-right-click
  "world-in - `net.minecraft.world.World`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  hand-in - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.ActionResult [^ItemMonsterPlacer this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.EnumHand hand-in]
    (-> this (.onItemRightClick world-in player-in hand-in))))

(defn get-sub-items
  "item-in - `net.minecraft.item.Item`
  tab - `net.minecraft.creativetab.CreativeTabs`
  sub-items - `net.minecraft.util.NonNullList`"
  ([^ItemMonsterPlacer this ^net.minecraft.item.Item item-in ^net.minecraft.creativetab.CreativeTabs tab ^net.minecraft.util.NonNullList sub-items]
    (-> this (.getSubItems item-in tab sub-items))))

