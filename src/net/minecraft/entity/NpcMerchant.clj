(ns net.minecraft.entity.NpcMerchant
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity NpcMerchant]))

(defn ->npc-merchant
  "Constructor.

  customer-in - `net.minecraft.entity.player.EntityPlayer`
  name-in - `net.minecraft.util.text.ITextComponent`"
  (^NpcMerchant [^net.minecraft.entity.player.EntityPlayer customer-in ^net.minecraft.util.text.ITextComponent name-in]
    (new NpcMerchant customer-in name-in)))

(defn verify-selling-item
  "stack - `net.minecraft.item.ItemStack`"
  ([^NpcMerchant this ^net.minecraft.item.ItemStack stack]
    (-> this (.verifySellingItem stack))))

(defn set-recipes
  "recipe-list - `net.minecraft.village.MerchantRecipeList`"
  ([^NpcMerchant this ^net.minecraft.village.MerchantRecipeList recipe-list]
    (-> this (.setRecipes recipe-list))))

(defn get-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^NpcMerchant this]
    (-> this (.getDisplayName))))

(defn get-recipes
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.village.MerchantRecipeList`"
  (^net.minecraft.village.MerchantRecipeList [^NpcMerchant this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.getRecipes player))))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^NpcMerchant this]
    (-> this (.getWorld))))

(defn get-customer
  "returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^NpcMerchant this]
    (-> this (.getCustomer))))

(defn set-customer
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^NpcMerchant this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.setCustomer player))))

(defn get-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^NpcMerchant this]
    (-> this (.getPos))))

(defn use-recipe
  "recipe - `net.minecraft.village.MerchantRecipe`"
  ([^NpcMerchant this ^net.minecraft.village.MerchantRecipe recipe]
    (-> this (.useRecipe recipe))))

