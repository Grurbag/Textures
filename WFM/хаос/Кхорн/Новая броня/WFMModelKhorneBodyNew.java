// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelKhorneBodyNew extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer spike_r1;
	private final ModelRenderer LeftArm_r2;
	private final ModelRenderer nalokotnik_r1;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer nalokotnik_r2;
	private final ModelRenderer RightArm_r2;

	public WFMModelKhorneBodyNew() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.5F, false));
		Body.cubeList.add(new ModelBox(Body, 16, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.8F, false));
		Body.cubeList.add(new ModelBox(Body, 20, 32, -4.5F, 1.0F, -3.0F, 9, 12, 0, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 40, 16, -4.0F, -2.0F, -2.0F, 5, 12, 4, 0.49F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 48, -4.0F, -2.0F, -2.0F, 5, 12, 4, 0.69F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 8, -2.75F, -2.0F, -4.5F, 5, 5, 0, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 35, -9.75F, 2.0F, -0.5F, 5, 9, 0, 0.0F, true));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 13, -2.75F, -2.0F, 4.5F, 5, 11, 0, 0.0F, false));

		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setRotationPoint(-3.2479F, -0.4674F, 0.0F);
		RightArm.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, 0.0F, 0.0F, -0.1309F);
		LeftArm_r1.cubeList.add(new ModelBox(LeftArm_r1, 34, 36, -4.0F, -3.5F, -4.0F, 7, 6, 8, 0.1F, true));
		LeftArm_r1.cubeList.add(new ModelBox(LeftArm_r1, 34, 50, -4.0F, -3.5F, -4.0F, 7, 6, 8, 0.3F, true));

		spike_r1 = new ModelRenderer(this);
		spike_r1.setRotationPoint(-7.0F, -6.5F, 5.0F);
		RightArm.addChild(spike_r1);
		setRotationAngle(spike_r1, 0.0F, 0.0F, -0.1745F);
		spike_r1.cubeList.add(new ModelBox(spike_r1, 10, 35, -0.75F, -4.5F, -5.0F, 5, 9, 0, 0.0F, false));

		LeftArm_r2 = new ModelRenderer(this);
		LeftArm_r2.setRotationPoint(-2.1061F, 0.81F, 0.0F);
		RightArm.addChild(LeftArm_r2);
		setRotationAngle(LeftArm_r2, 0.0F, 0.0F, -0.0436F);
		LeftArm_r2.cubeList.add(new ModelBox(LeftArm_r2, 40, 0, -3.0F, -3.5F, -3.0F, 6, 7, 6, -0.15F, true));

		nalokotnik_r1 = new ModelRenderer(this);
		nalokotnik_r1.setRotationPoint(-2.0F, 6.0F, 0.0F);
		RightArm.addChild(nalokotnik_r1);
		setRotationAngle(nalokotnik_r1, 0.0F, 0.0F, 0.7854F);
		nalokotnik_r1.cubeList.add(new ModelBox(nalokotnik_r1, 0, 0, -2.0F, -1.0F, -2.5F, 3, 3, 5, 0.69F, true));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 40, 16, -1.0F, -2.0F, -2.0F, 5, 12, 4, 0.49F, true));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 48, -1.0F, -2.0F, -2.0F, 5, 12, 4, 0.69F, true));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 8, -1.75F, -2.0F, -4.5F, 5, 5, 0, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 35, 4.25F, 2.0F, -0.5F, 5, 9, 0, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 13, -1.75F, -2.0F, 4.5F, 5, 11, 0, 0.0F, false));

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setRotationPoint(3.0F, -0.5F, 0.0F);
		LeftArm.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.0F, 0.0F, 0.1309F);
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 34, 36, -2.75F, -3.5F, -4.0F, 7, 6, 8, 0.1F, false));
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 34, 50, -2.75F, -3.5F, -4.0F, 7, 6, 8, 0.3F, false));

		nalokotnik_r2 = new ModelRenderer(this);
		nalokotnik_r2.setRotationPoint(3.0F, 6.0F, 0.0F);
		LeftArm.addChild(nalokotnik_r2);
		setRotationAngle(nalokotnik_r2, 0.0F, 0.0F, 0.7854F);
		nalokotnik_r2.cubeList.add(new ModelBox(nalokotnik_r2, 0, 0, -2.0F, -1.0F, -2.5F, 3, 3, 5, 0.69F, true));

		RightArm_r2 = new ModelRenderer(this);
		RightArm_r2.setRotationPoint(2.1061F, 0.81F, 0.0F);
		LeftArm.addChild(RightArm_r2);
		setRotationAngle(RightArm_r2, 0.0F, 0.0F, 0.0436F);
		RightArm_r2.cubeList.add(new ModelBox(RightArm_r2, 40, 0, -3.0F, -3.5F, -3.0F, 6, 7, 6, -0.15F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
		RightArm.render(f5);
		LeftArm.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}