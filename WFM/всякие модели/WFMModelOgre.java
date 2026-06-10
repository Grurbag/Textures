package .minecraft;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * WFMModelOgre - Either Mojang or a mod author
 * Created using Tabula 4.1.1
 */
public class WFMModelOgre extends ModelBase {
    public ModelRenderer field_78114_d;
    public ModelRenderer field_78112_f;
    public ModelRenderer field_78124_i;
    public ModelRenderer field_78116_c;
    public ModelRenderer field_78115_e;
    public ModelRenderer field_78113_g;
    public ModelRenderer field_78123_h;
    public ModelRenderer field_78121_j;
    public ModelRenderer field_78112_fChild;
    public ModelRenderer field_78124_iChild;
    public ModelRenderer field_78124_iChild_1;
    public ModelRenderer field_78116_cChild;
    public ModelRenderer field_78116_cChild_1;
    public ModelRenderer field_78116_cChild_2;
    public ModelRenderer field_78115_eChild;
    public ModelRenderer field_78115_eChild_1;
    public ModelRenderer field_78113_gChild;
    public ModelRenderer field_78123_hChild;
    public ModelRenderer field_78123_hChild_1;

    public WFMModelOgre() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.field_78124_i = new ModelRenderer(this, 0, 78);
        this.field_78124_i.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.field_78124_i.addBox(-5.5F, 0.0F, -6.0F, 11, 12, 12, 0.0F);
        this.field_78112_fChild = new ModelRenderer(this, 0, 48);
        this.field_78112_fChild.mirror = true;
        this.field_78112_fChild.setRotationPoint(-12.0F, -23.0F, 0.0F);
        this.field_78112_fChild.addBox(2.0999999046325684F, 30.0F, -5.0F, 10, 20, 10, 0.0F);
        this.field_78121_j = new ModelRenderer(this, 24, 0);
        this.field_78121_j.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78121_j.addBox(-3.0F, -6.0F, -1.0F, 6, 6, 1, 0.0F);
        this.field_78116_cChild = new ModelRenderer(this, 40, 0);
        this.field_78116_cChild.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78116_cChild.addBox(5.900000095367432F, -6.0F, -3.0F, 1, 4, 3, 0.0F);
        this.field_78115_eChild_1 = new ModelRenderer(this, 52, 65);
        this.field_78115_eChild_1.setRotationPoint(-5.0F, -32.0F, -4.0F);
        this.field_78115_eChild_1.addBox(0.0F, 0.0F, -2.5F, 10, 10, 10, 0.0F);
        this.field_78113_g = new ModelRenderer(this, 0, 24);
        this.field_78113_g.setRotationPoint(12.0F, -23.0F, 0.0F);
        this.field_78113_g.addBox(-2.0F, -3.0F, -6.0F, 12, 12, 12, 0.0F);
        this.setRotateAngle(field_78113_g, 0.0F, 0.0F, -0.10000000149011613F);
        this.field_78116_c = new ModelRenderer(this, 0, 0);
        this.field_78116_c.setRotationPoint(0.0F, -30.0F, -1.0F);
        this.field_78116_c.addBox(-6.0F, -10.0F, -7.0F, 12, 12, 12, 0.0F);
        this.field_78116_cChild_2 = new ModelRenderer(this, 40, 0);
        this.field_78116_cChild_2.mirror = true;
        this.field_78116_cChild_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78116_cChild_2.addBox(-6.900000095367432F, -6.0F, -3.0F, 1, 4, 3, 0.0F);
        this.field_78124_iChild_1 = new ModelRenderer(this, 2, 110);
        this.field_78124_iChild_1.mirror = true;
        this.field_78124_iChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78124_iChild_1.addBox(-4.5F, 18.0F, -8.0F, 10, 6, 8, 0.0F);
        this.field_78123_h = new ModelRenderer(this, 0, 78);
        this.field_78123_h.mirror = true;
        this.field_78123_h.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.field_78123_h.addBox(-5.5F, 0.0F, -6.0F, 11, 12, 12, 0.0F);
        this.field_78116_cChild_1 = new ModelRenderer(this, 0, 0);
        this.field_78116_cChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78116_cChild_1.addBox(-1.0F, -5.0F, -8.100000381469727F, 2, 3, 2, 0.0F);
        this.field_78114_d = new ModelRenderer(this, 32, 0);
        this.field_78114_d.setRotationPoint(0.0F, -30.0F, -1.0F);
        this.field_78114_d.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
        this.field_78112_f = new ModelRenderer(this, 0, 24);
        this.field_78112_f.mirror = true;
        this.field_78112_f.setRotationPoint(-12.0F, -23.0F, 0.0F);
        this.field_78112_f.addBox(-9.100000381469727F, -3.0F, -6.0F, 12, 12, 12, 0.0F);
        this.setRotateAngle(field_78112_f, 0.0F, 0.0F, 0.10000000149011613F);
        this.field_78124_iChild = new ModelRenderer(this, 0, 102);
        this.field_78124_iChild.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.field_78124_iChild.addBox(-10.5F, 12.0F, -5.0F, 10, 12, 10, 0.0F);
        this.field_78113_gChild = new ModelRenderer(this, 0, 48);
        this.field_78113_gChild.setRotationPoint(0.0F, -23.0F, -0.0F);
        this.field_78113_gChild.addBox(0.8999999761581421F, 30.0F, -5.0F, 10, 20, 10, 0.0F);
        this.field_78115_eChild = new ModelRenderer(this, 57, 42);
        this.field_78115_eChild.setRotationPoint(2.0F, 0.0F, 1.0F);
        this.field_78115_eChild.addBox(-12.0F, -16.0F, -14.0F, 20, 18, 5, 0.0F);
        this.field_78123_hChild_1 = new ModelRenderer(this, 0, 102);
        this.field_78123_hChild_1.mirror = true;
        this.field_78123_hChild_1.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.field_78123_hChild_1.addBox(0.5F, 12.0F, -5.0F, 10, 12, 10, 0.0F);
        this.field_78123_hChild = new ModelRenderer(this, 2, 110);
        this.field_78123_hChild.mirror = true;
        this.field_78123_hChild.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78123_hChild.addBox(-5.5F, 18.0F, -8.0F, 10, 6, 8, 0.0F);
        this.field_78115_e = new ModelRenderer(this, 48, 0);
        this.field_78115_e.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.field_78115_e.addBox(-11.0F, -28.0F, -8.0F, 22, 28, 14, 0.0F);
        this.field_78112_f.addChild(this.field_78112_fChild);
        this.field_78116_c.addChild(this.field_78116_cChild);
        this.field_78115_e.addChild(this.field_78115_eChild_1);
        this.field_78116_c.addChild(this.field_78116_cChild_2);
        this.field_78124_i.addChild(this.field_78124_iChild_1);
        this.field_78116_c.addChild(this.field_78116_cChild_1);
        this.field_78124_i.addChild(this.field_78124_iChild);
        this.field_78113_g.addChild(this.field_78113_gChild);
        this.field_78115_e.addChild(this.field_78115_eChild);
        this.field_78123_h.addChild(this.field_78123_hChild_1);
        this.field_78123_h.addChild(this.field_78123_hChild);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.field_78124_i.render(f5);
        this.field_78121_j.render(f5);
        this.field_78113_g.render(f5);
        this.field_78116_c.render(f5);
        this.field_78123_h.render(f5);
        this.field_78114_d.render(f5);
        this.field_78112_f.render(f5);
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
