package io.github.spartanawakens.data;

import com.google.common.collect.ImmutableList;
import com.oblivioussp.spartanweaponry.ModSpartanWeaponry;
import io.github.spartanawakens.SpartanAwakens;
import io.github.spartanawakens.registry.SAItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraftforge.common.data.LanguageProvider;
import org.apache.commons.lang3.text.WordUtils;

import java.util.List;

public class SALanguageProvider extends LanguageProvider {

    public SALanguageProvider(DataGenerator gen, String modid, String locale) {
        super(gen, modid, locale);
    }

    @Override
    protected void addTranslations() {
        addSAWeapons(SAItems.daggers.getAsList());
        addSAWeapons(SAItems.parryingDaggers.getAsList());
        addSAWeapons(SAItems.longswords.getAsList());
        addSAWeapons(SAItems.katanas.getAsList());
        addSAWeapons(SAItems.sabers.getAsList());
        addSAWeapons(SAItems.rapiers.getAsList());
        addSAWeapons(SAItems.greatswords.getAsList());
        addSAWeapons(SAItems.battleHammers.getAsList());
        addSAWeapons(SAItems.warhammers.getAsList());
        addSAWeapons(SAItems.spears.getAsList());
        addSAWeapons(SAItems.halberds.getAsList());
        addSAWeapons(SAItems.pikes.getAsList());
        addSAWeapons(SAItems.lances.getAsList());

        addSWWeapons(SAItems.longbows.getAsList());
        addSWWeapons(SAItems.heavyCrossbows.getAsList());
        addSWWeapons(SAItems.throwingKnives.getAsList());
        addSWWeapons(SAItems.tomahawks.getAsList());
        addSWWeapons(SAItems.javelins.getAsList());
        addSWWeapons(SAItems.boomerangs.getAsList());

        addSAWeapons(SAItems.battleaxes.getAsList());
        addSAWeapons(SAItems.flangedMaces.getAsList());
        addSAWeapons(SAItems.glaives.getAsList());
        addSAWeapons(SAItems.quarterstaves.getAsList());
        addSAWeapons(SAItems.scythes.getAsList());
    }

    public void addNormalItem(Item item) {
        add("item." + SpartanAwakens.MODID + "." + item.getRegistryName().getPath(), swString(item));
    }

    public void addSAWeapons(ImmutableList<? extends Item> items) {
        for (Item item : items) {
            add("item." + SpartanAwakens.MODID + "." + item.getRegistryName().getPath(), swString(item));
        }
    }

    public void addSWWeapons(ImmutableList<? extends Item> items) {
        for (Item item : items) {
            add("item." + ModSpartanWeaponry.ID + "." + item.getRegistryName().getPath(), swString(item));
        }
    }

    public String swString(Item item) {
        String capText = capitalizedSpacedText(item.getRegistryName().getPath());
        String[] split = capText.split(" ");

        if (split.length == 1) {
            return split[0];

        } else if (split.length == 2) {
            if (SAItems.battleHammers.getAsList().contains(item)) {
                return split[1] + " Battle " + split[0];
            } else {
                return split[1] + " " + split[0];
            }

        } else if (split.length == 3) {
            if (SAItems.battleHammers.getAsList().contains(item)) {
                String firstWord = split[1] + " " + split[2];
                String secondWord = split[0];
                return firstWord + " Battle " + secondWord;
            } else if (twoStringBase(item)) {
                String firstWord = split[2];
                String secondWord = split[0] + " " + split[1];
                return firstWord + " " + secondWord;
            } else {
                String firstWord = split[1] + " " + split[2];
                String secondWord = split[0];
                return firstWord + " " + secondWord;
            }

        } else if (split.length == 4) {
            String firstWord = split[2] + " " + split[3];
            String secondWord = split[0] + " " + split[1];
            return firstWord + " " + secondWord;

        } else {
            return capText;
        }
    }

    public boolean twoStringBase(Item item) {
        List<? extends Item> heavyCrossbowsAsList = SAItems.heavyCrossbows.getAsList();
        List<? extends Item> throwingKnivesAsList = SAItems.throwingKnives.getAsList();
        return heavyCrossbowsAsList.contains(item) || throwingKnivesAsList.contains(item);
    }

    public String capitalizedSpacedText(String string) {
        return WordUtils.capitalize(string.replace("_", " "));
    }
}
