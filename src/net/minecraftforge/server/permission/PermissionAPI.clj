(ns net.minecraftforge.server.permission.PermissionAPI
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.server.permission PermissionAPI]))

(defn ->permission-api
  "Constructor."
  (^PermissionAPI []
    (new PermissionAPI )))

(defn *set-permission-handler
  "Only use this in PreInit state!

  handler - `net.minecraftforge.server.permission.IPermissionHandler`"
  ([^net.minecraftforge.server.permission.IPermissionHandler handler]
    (PermissionAPI/setPermissionHandler handler)))

(defn *get-permission-handler
  "returns: `net.minecraftforge.server.permission.IPermissionHandler`"
  (^net.minecraftforge.server.permission.IPermissionHandler []
    (PermissionAPI/getPermissionHandler )))

(defn *register-node
  "Only use this after PreInit state!

  node - Permission node, best if it's lowercase and contains '.' (e.g. \"modid.subgroup.permission_id\") - `java.lang.String`
  level - Default permission level for this node. If not isn't registered, it's level is going to be 'NONE' - `net.minecraftforge.server.permission.DefaultPermissionLevel`
  desc - Optional description of the node - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String node ^net.minecraftforge.server.permission.DefaultPermissionLevel level ^java.lang.String desc]
    (PermissionAPI/registerNode node level desc)))

(defn *has-permission?
  "Shortcut method using EntityPlayer and creating PlayerContext

  player - `net.minecraft.entity.player.EntityPlayer`
  node - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.player.EntityPlayer player ^java.lang.String node]
    (PermissionAPI/hasPermission player node))
  (^Boolean [^com.mojang.authlib.GameProfile profile ^java.lang.String node ^net.minecraftforge.server.permission.context.IContext context]
    (PermissionAPI/hasPermission profile node context)))

