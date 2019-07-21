(ns net.minecraftforge.event.entity.player.ArrowNockEvent
  "ArrowNockEvent is fired when a player begins using a bow.
  This event is fired whenever a player begins using a bow in
  ItemBow.onItemRightClick(World, EntityPlayer, EnumHand).

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player ArrowNockEvent]))

(defn ->arrow-nock-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  item - `net.minecraft.item.ItemStack`
  hand - `net.minecraft.util.EnumHand`
  world - `net.minecraft.world.World`
  has-ammo - `boolean`"
  (^ArrowNockEvent [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack item ^net.minecraft.util.EnumHand hand ^net.minecraft.world.World world ^Boolean has-ammo]
    (new ArrowNockEvent player item hand world has-ammo)))

(defn get-bow
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ArrowNockEvent this]
    (-> this (.getBow))))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^ArrowNockEvent this]
    (-> this (.getWorld))))

(defn get-hand
  "returns: `net.minecraft.util.EnumHand`"
  (^net.minecraft.util.EnumHand [^ArrowNockEvent this]
    (-> this (.getHand))))

(defn has-ammo?
  "returns: `boolean`"
  (^Boolean [^ArrowNockEvent this]
    (-> this (.hasAmmo))))

(defn get-action
  "returns: `net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.ActionResult [^ArrowNockEvent this]
    (-> this (.getAction))))

(defn set-action
  "action - `net.minecraft.util.ActionResult`"
  ([^ArrowNockEvent this ^net.minecraft.util.ActionResult action]
    (-> this (.setAction action))))

