package .minecraft;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * WFMModelBeastman - Either Mojang or a mod author
 * Created using Tabula 4.1.1
 */
public class WFMModelBeastman extends ModelBase {
    public ModelRenderer field_78114_d;
    public ModelRenderer field_78112_f;
    public ModelRenderer field_78116_c;
    public ModelRenderer field_78115_e;
    public ModelRenderer field_78113_g;
    public ModelRenderer field_78124_i;
    public ModelRenderer field_78123_h;
    public ModelRenderer field_78121_j;
    public ModelRenderer field_78116_cChild;
    public ModelRenderer field_78116_cChild_1;
    public ModelRenderer field_78116_cChild_2;
    public ModelRenderer field_78116_cChild_3;
    public ModelRenderer field_78116_cChild_4;
    public ModelRenderer field_78116_cChildChild;
    public ModelRenderer field_78116_cChildChild_1;
    public ModelRenderer field_78116_cChildChild_2;
    public ModelRenderer field_78116_cChildChild_3;
    public ModelRenderer field_78116_cChildChild_4;
    public ModelRenderer field_78116_cChildChild_5;
    public ModelRenderer field_78116_cChildChild_6;
    public ModelRenderer field_78116_cChildChild_7;
    public ModelRenderer field_78124_iChild;
    public ModelRenderer field_78124_iChild_1;
    public ModelRenderer field_78123_hChild;
    public ModelRenderer field_78123_hChild_1;

    public WFMModelBeastman() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.field_78113_g = new ModelRenderer(this, 40, 16);
        this.field_78113_g.mirror = true;
        this.field_78113_g.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.field_78113_g.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(field_78113_g, 0.0F, 0.0F, -0.10000000149011613F);
        this.field_78116_cChild = new ModelRenderer(this, 48, 32);
        this.field_78116_cChild.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78116_cChild.addBox(-1.7999999523162842F, -4.0F, -7.0F, 4, 4, 4, 0.0F);
        this.field_78124_iChild_1 = new ModelRenderer(this, 0, 57);
        this.field_78124_iChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78124_iChild_1.addBox(-2.0F, 9.0F, -3.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(field_78124_iChild_1, 0.31869712471961975F, 0.0F, 0.0F);
        this.field_78116_cChildChild = new ModelRenderer(this, 51, 57);
        this.field_78116_cChildChild.setRotationPoint(-6.0F, 2.0F, 10.800000190734863F);
        this.field_78116_cChildChild.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(field_78116_cChildChild, -2.640683174133301F, 0.8651596903800965F, 0.5918411612510681F);
        this.field_78124_iChild = new ModelRenderer(this, 0, 48);
        this.field_78124_iChild.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78124_iChild.addBox(-1.5F, 4.699999809265137F, 0.5F, 3, 6, 3, 0.0F);
        this.field_78124_i = new ModelRenderer(this, 0, 16);
        this.field_78124_i.mirror = true;
        this.field_78124_i.setRotationPoint(2.0999999046325684F, 12.0F, 0.10000000149011612F);
        this.field_78124_i.addBox(-2.0F, -0.800000011920929F, -2.299999952316284F, 4, 8, 4, -8.940696716308594E-8F);
        this.setRotateAngle(field_78124_i, -0.43633231520652765F, 0.0F, 0.0F);
        this.field_78116_cChild_3 = new ModelRenderer(this, 50, 40);
        this.field_78116_cChild_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78116_cChild_3.addBox(-4.400000095367432F, -6.5F, 4.699999809265137F, 2, 2, 5, 0.0F);
        this.setRotateAngle(field_78116_cChild_3, 0.9075711965560913F, -0.34906584024429316F, 0.0F);
        this.field_78116_cChild_4 = new ModelRenderer(this, 50, 40);
        this.field_78116_cChild_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78116_cChild_4.addBox(2.4000000953674316F, -6.300000190734863F, 4.900000095367432F, 2, 2, 4, 0.0F);
        this.setRotateAngle(field_78116_cChild_4, 0.9105382561683655F, 0.36425021290779114F, 0.0F);
        this.field_78114_d = new ModelRenderer(this, 32, 0);
        this.field_78114_d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78114_d.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
        this.field_78112_f = new ModelRenderer(this, 40, 16);
        this.field_78112_f.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.field_78112_f.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.field_78123_h = new ModelRenderer(this, 0, 16);
        this.field_78123_h.setRotationPoint(-2.0999999046325684F, 12.0F, 0.10000000149011612F);
        this.field_78123_h.addBox(-2.0F, -0.800000011920929F, -2.299999952316284F, 4, 8, 4, -8.940696716308594E-8F);
        this.setRotateAngle(field_78123_h, -0.43633231520652765F, 0.0F, 0.0F);
        this.field_78123_hChild_1 = new ModelRenderer(this, 0, 57);
        this.field_78123_hChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78123_hChild_1.addBox(-2.0F, 9.0F, -3.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(field_78123_hChild_1, 0.31869712471961975F, 0.0F, 0.0F);
        this.field_78116_c = new ModelRenderer(this, 0, 0);
        this.field_78116_c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78116_c.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.setRotateAngle(field_78116_c, 0.08726646006107329F, 0.0F, 0.0F);
        this.field_78116_cChildChild_3 = new ModelRenderer(this, 51, 57);
        this.field_78116_cChildChild_3.setRotationPoint(5.5F, 2.4000000953674316F, 10.0F);
        this.field_78116_cChildChild_3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(field_78116_cChildChild_3, -2.640683174133301F, -0.8651596903800965F, -0.5918411612510681F);
        this.field_78123_hChild = new ModelRenderer(this, 0, 48);
        this.field_78123_hChild.setRotationPoint(0.0F, 0.0F, -0.10000000149011612F);
        this.field_78123_hChild.addBox(-1.5F, 4.699999809265137F, 0.5F, 3, 6, 3, 0.0F);
        this.field_78116_cChild_2 = new ModelRenderer(this, 50, 40);
        this.field_78116_cChild_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78116_cChild_2.addBox(2.4000000953674316F, -6.300000190734863F, 4.900000095367432F, 2, 2, 4, 0.0F);
        this.setRotateAngle(field_78116_cChild_2, 0.9105382561683655F, 0.36425021290779114F, 0.0F);
        this.field_78116_cChildChild_7 = new ModelRenderer(this, 51, 57);
        this.field_78116_cChildChild_7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78116_cChildChild_7.addBox(2.9000000953674316F, -10.0F, 6.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(field_78116_cChildChild_7, -0.4553563892841339F, 0.0F, 0.0F);
        this.field_78121_j = new ModelRenderer(this, 24, 0);
        this.field_78121_j.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78121_j.addBox(-3.0F, -6.0F, -1.0F, 6, 6, 1, 0.0F);
        this.field_78116_cChildChild_5 = new ModelRenderer(this, 51, 57);
        this.field_78116_cChildChild_5.setRotationPoint(2.9000000953674316F, -6.199999809265137F, 9.800000190734863F);
        this.field_78116_cChildChild_5.addBox(0.0F, 0.0F, 0.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(field_78116_cChildChild_5, -1.0471975803375244F, 0.0F, 0.0F);
        this.field_78116_cChildChild_1 = new ModelRenderer(this, 51, 57);
        this.field_78116_cChildChild_1.setRotationPoint(-3.700000047683716F, -2.0999999046325684F, 12.399999618530273F);
        this.field_78116_cChildChild_1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(field_78116_cChildChild_1, -1.8212510347366333F, 0.0F, 0.5918411612510681F);
        this.field_78116_cChildChild_4 = new ModelRenderer(this, 51, 57);
        this.field_78116_cChildChild_4.setRotationPoint(2.9000000953674316F, -1.5F, 12.199999809265137F);
        this.field_78116_cChildChild_4.addBox(0.0F, 0.0F, 0.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(field_78116_cChildChild_4, -1.8212510347366333F, 0.0F, -0.5918411612510681F);
        this.field_78116_cChildChild_6 = new ModelRenderer(this, 51, 57);
        this.field_78116_cChildChild_6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78116_cChildChild_6.addBox(-3.799999952316284F, -10.0F, 5.800000190734863F, 1, 2, 5, 0.0F);
        this.setRotateAngle(field_78116_cChildChild_6, -0.4621631801128388F, 0.0F, 0.0F);
        this.field_78116_cChildChild_2 = new ModelRenderer(this, 51, 57);
        this.field_78116_cChildChild_2.setRotationPoint(-3.9000000953674316F, -6.199999809265137F, 9.899999618530273F);
        this.field_78116_cChildChild_2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(field_78116_cChildChild_2, -1.0471975803375244F, 0.0F, 0.0F);
        this.field_78116_cChild_1 = new ModelRenderer(this, 50, 40);
        this.field_78116_cChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78116_cChild_1.addBox(-4.400000095367432F, -6.5F, 4.699999809265137F, 2, 2, 5, 0.0F);
        this.setRotateAngle(field_78116_cChild_1, 0.9075711965560913F, -0.34906584024429316F, 0.0F);
        this.field_78115_e = new ModelRenderer(this, 16, 16);
        this.field_78115_e.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78115_e.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.field_78116_c.addChild(this.field_78116_cChild);
        this.field_78124_i.addChild(this.field_78124_iChild_1);
        this.field_78116_cChild_1.addChild(this.field_78116_cChildChild);
        this.field_78124_i.addChild(this.field_78124_iChild);
        this.field_78116_c.addChild(this.field_78116_cChild_3);
        this.field_78116_c.addChild(this.field_78116_cChild_4);
        this.field_78123_h.addChild(this.field_78123_hChild_1);
        this.field_78116_cChild_2.addChild(this.field_78116_cChildChild_3);
        this.field_78123_h.addChild(this.field_78123_hChild);
        this.field_78116_c.addChild(this.field_78116_cChild_2);
        this.field_78116_cChild_4.addChild(this.field_78116_cChildChild_7);
        this.field_78116_cChild_2.addChild(this.field_78116_cChildChild_5);
        this.field_78116_cChild_1.addChild(this.field_78116_cChildChild_1);
        this.field_78116_cChild_2.addChild(this.field_78116_cChildChild_4);
        this.field_78116_cChild_3.addChild(this.field_78116_cChildChild_6);
        this.field_78116_cChild_1.addChild(this.field_78116_cChildChild_2);
        this.field_78116_c.addChild(this.field_78116_cChild_1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.field_78113_g.render(f5);
        this.field_78124_i.render(f5);
        this.field_78114_d.render(f5);
        this.field_78112_f.render(f5);
        this.field_78123_h.render(f5);
        this.field_78116_c.render(f5);
        this.field_78121_j.render(f5);
        this.field_78115_e.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
