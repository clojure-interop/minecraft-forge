(ns net.minecraft.entity.IMerchant
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity IMerchant]))

(defn verify-selling-item
  "stack - `net.minecraft.item.ItemStack`"
  ([^IMerchant this ^net.minecraft.item.ItemStack stack]
    (-> this (.verifySellingItem stack))))

(defn set-recipes
  "recipe-list - `net.minecraft.village.MerchantRecipeList`"
  ([^IMerchant this ^net.minecraft.village.MerchantRecipeList recipe-list]
    (-> this (.setRecipes recipe-list))))

(defn get-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^IMerchant this]
    (-> this (.getDisplayName))))

(defn get-recipes
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.village.MerchantRecipeList`"
  (^net.minecraft.village.MerchantRecipeList [^IMerchant this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.getRecipes player))))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^IMerchant this]
    (-> this (.getWorld))))

(defn get-customer
  "returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^IMerchant this]
    (-> this (.getCustomer))))

(defn set-customer
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^IMerchant this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.setCustomer player))))

(defn get-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^IMerchant this]
    (-> this (.getPos))))

(defn use-recipe
  "recipe - `net.minecraft.village.MerchantRecipe`"
  ([^IMerchant this ^net.minecraft.village.MerchantRecipe recipe]
    (-> this (.useRecipe recipe))))

