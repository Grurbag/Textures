package .minecraft;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * WFMModelSkaven - Either Mojang or a mod author
 * Created using Tabula 4.1.1
 */
public class WFMModelSkaven extends ModelBase {
    public ModelRenderer field_78114_d;
    public ModelRenderer field_78124_i0;
    public ModelRenderer field_78124_i1;
    public ModelRenderer field_78116_c;
    public ModelRenderer field_78115_e0;
    public ModelRenderer field_78115_e1;
    public ModelRenderer field_78123_h0;
    public ModelRenderer field_78123_h1;
    public ModelRenderer field_78121_j;
    public ModelRenderer field_78124_iChild;
    public ModelRenderer field_78116_cChild;
    public ModelRenderer field_78116_cChild_1;
    public ModelRenderer field_78116_cChild_2;
    public ModelRenderer field_78116_cChild_3;
    public ModelRenderer field_78116_cChild_4;
    public ModelRenderer field_78116_cChildChild;
    public ModelRenderer field_78116_cChildChild_1;
    public ModelRenderer field_78116_cChildChildChild;
    public ModelRenderer field_78116_cChildChild_2;
    public ModelRenderer field_78116_cChildChildChild_1;
    public ModelRenderer field_78115_eChild0;
    public ModelRenderer field_78115_eChild1;
    public ModelRenderer field_78115_eChild0_1;
    public ModelRenderer field_78115_eChild1_1;
    public ModelRenderer field_78115_eChild0_2;
    public ModelRenderer field_78115_eChild1_2;
    public ModelRenderer field_78115_eChild2;
    public ModelRenderer field_78123_hChild;

    public WFMModelSkaven() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.field_78116_cChild_2 = new ModelRenderer(this, 0, 78);
        this.field_78116_cChild_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78116_cChild_2.addBox(-10.0F, -0.0F, 4.0F, 4, 4, 0, 0.0F);
        this.setRotateAngle(field_78116_cChild_2, 0.0F, 3.1415927410125732F, 0.0F);
        this.field_78116_cChildChild_2 = new ModelRenderer(this, 82, 110);
        this.field_78116_cChildChild_2.setRotationPoint(2.700000047683716F, -4.400000095367432F, -8.0F);
        this.field_78116_cChildChild_2.addBox(0.0F, -1.0F, 1.0F, 2, 3, 10, 0.0F);
        this.setRotateAngle(field_78116_cChildChild_2, -0.5230751633644104F, -0.2617993950843811F, 0.0017453292384743693F);
        this.field_78115_eChild1 = new ModelRenderer(this, 93, 136);
        this.field_78115_eChild1.setRotationPoint(-9.0F, -25.0F, 0.0F);
        this.field_78115_eChild1.addBox(-6.5F, 8.0F, -3.0F, 6, 16, 6, 0.0F);
        this.setRotateAngle(field_78115_eChild1, 0.0F, 0.0F, 0.10000000149011613F);
        this.field_78124_i1 = new ModelRenderer(this, 46, 208);
        this.field_78124_i1.mirror = true;
        this.field_78124_i1.setRotationPoint(6.0F, 6.0F, 3.0F);
        this.field_78124_i1.addBox(0.5F, 2.0F, 4.0F, 6, 13, 5, 0.0F);
        this.setRotateAngle(field_78124_i1, -0.34906584024429316F, 0.0F, 0.0F);
        this.field_78115_eChild0 = new ModelRenderer(this, 93, 136);
        this.field_78115_eChild0.setRotationPoint(-9.0F, -25.0F, 0.0F);
        this.field_78115_eChild0.addBox(-7.0F, -2.0F, -4.0F, 7, 10, 8, 0.0F);
        this.setRotateAngle(field_78115_eChild0, 0.0F, 0.0F, 0.10000000149011613F);
        this.field_78115_eChild2 = new ModelRenderer(this, 96, 175);
        this.field_78115_eChild2.setRotationPoint(0.0F, -3.0F, 3.0F);
        this.field_78115_eChild2.addBox(-1.5F, -2.0F, 24.0F, 3, 3, 12, 0.0F);
        this.setRotateAngle(field_78115_eChild2, -0.43633231520652765F, 0.0F, 0.0F);
        this.field_78115_eChild0_2 = new ModelRenderer(this, 96, 175);
        this.field_78115_eChild0_2.setRotationPoint(0.0F, -3.0F, 3.0F);
        this.field_78115_eChild0_2.addBox(-3.5F, -3.0F, 2.0F, 6, 6, 10, 0.0F);
        this.setRotateAngle(field_78115_eChild0_2, -0.43633231520652765F, 0.0F, 0.0F);
        this.field_78116_cChildChild_1 = new ModelRenderer(this, 82, 110);
        this.field_78116_cChildChild_1.setRotationPoint(-1.7000000476837158F, -4.400000095367432F, -6.800000190734863F);
        this.field_78116_cChildChild_1.addBox(0.0F, -1.0F, 1.0F, 2, 3, 10, 0.0F);
        this.setRotateAngle(field_78116_cChildChild_1, -0.5230751633644104F, 0.2617993950843811F, 0.0017453292384743693F);
        this.field_78121_j = new ModelRenderer(this, 24, 0);
        this.field_78121_j.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78121_j.addBox(-3.0F, -6.0F, -1.0F, 6, 6, 1, 0.0F);
        this.field_78124_iChild = new ModelRenderer(this, 0, 243);
        this.field_78124_iChild.mirror = true;
        this.field_78124_iChild.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78124_iChild.addBox(0.0F, 15.0F, -6.0F, 7, 3, 9, 0.0F);
        this.setRotateAngle(field_78124_iChild, 0.43633231520652765F, 0.0F, 0.0F);
        this.field_78115_eChild1_2 = new ModelRenderer(this, 96, 175);
        this.field_78115_eChild1_2.setRotationPoint(0.0F, -3.0F, 3.0F);
        this.field_78115_eChild1_2.addBox(-2.5F, -2.5F, 11.0F, 5, 5, 14, 0.0F);
        this.setRotateAngle(field_78115_eChild1_2, -0.43633231520652765F, 0.0F, 0.0F);
        this.field_78115_eChild0_1 = new ModelRenderer(this, 93, 136);
        this.field_78115_eChild0_1.mirror = true;
        this.field_78115_eChild0_1.setRotationPoint(9.0F, -25.0F, 0.0F);
        this.field_78115_eChild0_1.addBox(0.0F, -2.0F, -4.0F, 7, 10, 8, 0.0F);
        this.setRotateAngle(field_78115_eChild0_1, 0.0F, 0.0F, -0.10000000149011613F);
        this.field_78116_cChild_4 = new ModelRenderer(this, 60, 110);
        this.field_78116_cChild_4.setRotationPoint(3.5F, -2.5F, -3.0F);
        this.field_78116_cChild_4.addBox(0.0F, 0.0F, 0.0F, 3, 3, 8, 0.0F);
        this.setRotateAngle(field_78116_cChild_4, -2.094395160675049F, 0.5235987901687622F, 0.0F);
        this.field_78116_cChild_1 = new ModelRenderer(this, 0, 78);
        this.field_78116_cChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78116_cChild_1.addBox(-10.0F, 0.0F, -4.0F, 4, 4, 0, 0.0F);
        this.field_78124_i0 = new ModelRenderer(this, 46, 230);
        this.field_78124_i0.mirror = true;
        this.field_78124_i0.setRotationPoint(6.0F, 6.0F, 3.0F);
        this.field_78124_i0.addBox(0.0F, -2.0F, -4.0F, 7, 9, 8, 0.0F);
        this.setRotateAngle(field_78124_i0, -0.34906584024429316F, 0.0F, 0.0F);
        this.field_78116_cChildChildChild = new ModelRenderer(this, 106, 110);
        this.field_78116_cChildChildChild.setRotationPoint(1.100000023841858F, -5.400000095367432F, -6.5F);
        this.field_78116_cChildChildChild.addBox(0.0F, -1.5F, 0.8999999761581421F, 1, 2, 10, 0.0F);
        this.setRotateAngle(field_78116_cChildChildChild, -0.6752678751945496F, -0.08726646006107329F, 0.0F);
        this.field_78116_cChild_3 = new ModelRenderer(this, 60, 110);
        this.field_78116_cChild_3.setRotationPoint(-6.5F, -2.5F, -4.5F);
        this.field_78116_cChild_3.addBox(0.0F, 0.0F, 0.0F, 3, 3, 8, 0.0F);
        this.setRotateAngle(field_78116_cChild_3, -2.094395160675049F, -0.5235987901687622F, 0.0F);
        this.field_78115_e0 = new ModelRenderer(this, 0, 38);
        this.field_78115_e0.setRotationPoint(0.0F, 7.0F, 3.0F);
        this.field_78115_e0.addBox(-8.0F, -15.0F, -6.0F, 16, 18, 12, 0.0F);
        this.field_78123_h0 = new ModelRenderer(this, 46, 230);
        this.field_78123_h0.setRotationPoint(-6.0F, 6.0F, 3.0F);
        this.field_78123_h0.addBox(-7.0F, -2.0F, -4.0F, 7, 9, 8, 0.0F);
        this.setRotateAngle(field_78123_h0, -0.34906584024429316F, 0.0F, 0.0F);
        this.field_78123_hChild = new ModelRenderer(this, 0, 243);
        this.field_78123_hChild.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78123_hChild.addBox(-7.0F, 15.0F, -6.0F, 7, 3, 9, 0.0F);
        this.setRotateAngle(field_78123_hChild, 0.43633231520652765F, 0.0F, 0.0F);
        this.field_78116_c = new ModelRenderer(this, 76, 0);
        this.field_78116_c.setRotationPoint(0.0F, -25.0F, -5.0F);
        this.field_78116_c.addBox(-6.0F, -0.0F, -12.0F, 12, 12, 14, 0.0F);
        this.field_78116_cChildChild = new ModelRenderer(this, 0, 72);
        this.field_78116_cChildChild.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78116_cChildChild.addBox(-2.0F, 8.0F, -14.0F, 4, 4, 1, 0.0F);
        this.field_78115_e1 = new ModelRenderer(this, 0, 0);
        this.field_78115_e1.setRotationPoint(0.0F, 7.0F, 3.0F);
        this.field_78115_e1.addBox(-9.0F, -29.0F, -7.0F, 18, 14, 15, 0.0F);
        this.field_78116_cChild = new ModelRenderer(this, 75, 46);
        this.field_78116_cChild.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.field_78116_cChild.addBox(-5.0F, -0.0F, -14.0F, 10, 8, 14, 0.0F);
        this.setRotateAngle(field_78116_cChild, 0.34906584024429316F, 0.0F, 0.0F);
        this.field_78115_eChild1_1 = new ModelRenderer(this, 93, 136);
        this.field_78115_eChild1_1.mirror = true;
        this.field_78115_eChild1_1.setRotationPoint(9.0F, -25.0F, 0.0F);
        this.field_78115_eChild1_1.addBox(0.5F, 8.0F, -3.0F, 6, 16, 6, 0.0F);
        this.setRotateAngle(field_78115_eChild1_1, 0.0F, 0.0F, -0.10000000149011613F);
        this.field_78114_d = new ModelRenderer(this, 32, 0);
        this.field_78114_d.setRotationPoint(0.0F, -25.0F, -5.0F);
        this.field_78114_d.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
        this.field_78116_cChildChildChild_1 = new ModelRenderer(this, 106, 110);
        this.field_78116_cChildChildChild_1.setRotationPoint(1.100000023841858F, -5.400000095367432F, -6.5F);
        this.field_78116_cChildChildChild_1.addBox(0.0F, -1.5F, 0.8999999761581421F, 1, 2, 10, 0.0F);
        this.setRotateAngle(field_78116_cChildChildChild_1, -0.6752678751945496F, -0.08726646006107329F, 0.0F);
        this.field_78123_h1 = new ModelRenderer(this, 46, 208);
        this.field_78123_h1.setRotationPoint(-6.0F, 6.0F, 3.0F);
        this.field_78123_h1.addBox(-6.5F, 2.0F, 4.0F, 6, 13, 5, 0.0F);
        this.setRotateAngle(field_78123_h1, -0.34906584024429316F, 0.0F, 0.0F);
        this.field_78116_c.addChild(this.field_78116_cChild_2);
        this.field_78116_cChild_4.addChild(this.field_78116_cChildChild_2);
        this.field_78115_e0.addChild(this.field_78115_eChild1);
        this.field_78115_e0.addChild(this.field_78115_eChild0);
        this.field_78115_e0.addChild(this.field_78115_eChild2);
        this.field_78115_e0.addChild(this.field_78115_eChild0_2);
        this.field_78116_cChild_3.addChild(this.field_78116_cChildChild_1);
        this.field_78124_i0.addChild(this.field_78124_iChild);
        this.field_78115_e0.addChild(this.field_78115_eChild1_2);
        this.field_78115_e0.addChild(this.field_78115_eChild0_1);
        this.field_78116_c.addChild(this.field_78116_cChild_4);
        this.field_78116_c.addChild(this.field_78116_cChild_1);
        this.field_78116_cChildChild_1.addChild(this.field_78116_cChildChildChild);
        this.field_78116_c.addChild(this.field_78116_cChild_3);
        this.field_78123_h0.addChild(this.field_78123_hChild);
        this.field_78116_cChild.addChild(this.field_78116_cChildChild);
        this.field_78116_c.addChild(this.field_78116_cChild);
        this.field_78115_e0.addChild(this.field_78115_eChild1_1);
        this.field_78116_cChildChild_2.addChild(this.field_78116_cChildChildChild_1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.field_78124_i1.render(f5);
        this.field_78121_j.render(f5);
        this.field_78124_i0.render(f5);
        this.field_78115_e0.render(f5);
        this.field_78123_h0.render(f5);
        this.field_78116_c.render(f5);
        this.field_78115_e1.render(f5);
        this.field_78114_d.render(f5);
        this.field_78123_h1.render(f5);
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
