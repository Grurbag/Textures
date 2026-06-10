// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelSIGMAR extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer cape;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer LeftArm_r2;
	private final ModelRenderer GHALMARAZ;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer RightArm_r2;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightLeg_r2;
	private final ModelRenderer RightBoot;
	private final ModelRenderer RightLeg_r3;
	private final ModelRenderer LeftBoot;
	private final ModelRenderer RightLeg_r4;

	public WFMModelSIGMAR() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, -0.3491F, 0.5672F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));
		Head.cubeList.add(new ModelBox(Head, 41, 16, -4.0F, 0.0F, -4.0F, 8, 8, 0, 0.0F, false));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 37, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.5F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 21, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.8F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 112, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		cape = new ModelRenderer(this);
		cape.setRotationPoint(0.0F, 2.0F, 5.0F);
		Body.addChild(cape);
		setRotationAngle(cape, 0.2182F, -0.0436F, 0.2618F);
		cape.cubeList.add(new ModelBox(cape, 0, 61, -7.0F, -5.0F, -1.0F, 15, 27, 0, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, -2.1319F, 0.543F, -0.1254F);
		RightArm.cubeList.add(new ModelBox(RightArm, 97, 59, -3.0F, -2.0F, -2.0F, 4, 14, 4, 0.49F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 76, 43, -3.0F, -2.0F, -2.0F, 4, 14, 4, 0.69F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 101, 110, -3.0F, -2.0F, -2.0F, 4, 14, 4, 0.0F, false));

		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setRotationPoint(-1.2479F, -0.4674F, 0.0F);
		RightArm.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, 0.0F, 0.0F, -0.1309F);
		LeftArm_r1.cubeList.add(new ModelBox(LeftArm_r1, 97, 78, -3.0F, -2.5F, -3.0F, 6, 5, 6, 0.1F, true));
		LeftArm_r1.cubeList.add(new ModelBox(LeftArm_r1, 97, 89, -3.0F, -2.5F, -3.0F, 6, 5, 6, 0.3F, true));

		LeftArm_r2 = new ModelRenderer(this);
		LeftArm_r2.setRotationPoint(-1.1061F, 0.81F, 0.0F);
		RightArm.addChild(LeftArm_r2);
		setRotationAngle(LeftArm_r2, 0.0F, 0.0F, -0.0436F);
		LeftArm_r2.cubeList.add(new ModelBox(LeftArm_r2, 97, 43, -3.0F, -3.5F, -3.0F, 6, 7, 6, -0.15F, true));

		GHALMARAZ = new ModelRenderer(this);
		GHALMARAZ.setRotationPoint(0.0F, 2.0F, 0.0F);
		RightArm.addChild(GHALMARAZ);
		setRotationAngle(GHALMARAZ, 0.0F, -0.2182F, 0.0F);
		GHALMARAZ.cubeList.add(new ModelBox(GHALMARAZ, 71, 0, -2.0F, 9.0F, -17.0F, 2, 2, 25, 0.0F, false));
		GHALMARAZ.cubeList.add(new ModelBox(GHALMARAZ, 83, 15, -2.5F, 8.5F, 8.0F, 3, 3, 3, 0.0F, false));
		GHALMARAZ.cubeList.add(new ModelBox(GHALMARAZ, 89, 22, -2.0F, 9.0F, 11.0F, 2, 2, 1, 0.0F, false));
		GHALMARAZ.cubeList.add(new ModelBox(GHALMARAZ, 89, 22, -2.0F, 9.0F, -10.0F, 2, 2, 1, 0.2F, false));
		GHALMARAZ.cubeList.add(new ModelBox(GHALMARAZ, 89, 22, -2.0F, 9.0F, -7.0F, 2, 2, 1, 0.2F, false));
		GHALMARAZ.cubeList.add(new ModelBox(GHALMARAZ, 89, 22, -2.0F, 9.0F, 6.0F, 2, 2, 1, 0.4F, false));
		GHALMARAZ.cubeList.add(new ModelBox(GHALMARAZ, 71, 0, -1.5F, 9.5F, -18.0F, 1, 1, 1, 0.0F, false));
		GHALMARAZ.cubeList.add(new ModelBox(GHALMARAZ, 71, 0, -3.0F, 7.5F, -16.0F, 4, 5, 5, 0.0F, false));
		GHALMARAZ.cubeList.add(new ModelBox(GHALMARAZ, 118, -5, 1.2F, 7.5F, -16.0F, 0, 5, 5, 0.0F, false));
		GHALMARAZ.cubeList.add(new ModelBox(GHALMARAZ, 118, -5, -3.2F, 7.5F, -16.0F, 0, 5, 5, 0.0F, false));
		GHALMARAZ.cubeList.add(new ModelBox(GHALMARAZ, 71, 11, -2.5F, 12.5F, -15.5F, 3, 1, 4, 0.0F, false));
		GHALMARAZ.cubeList.add(new ModelBox(GHALMARAZ, 71, 19, -2.5F, 6.5F, -15.5F, 3, 1, 4, 0.0F, false));
		GHALMARAZ.cubeList.add(new ModelBox(GHALMARAZ, 75, 40, -1.5F, 5.5F, -14.5F, 1, 1, 2, 0.0F, false));
		GHALMARAZ.cubeList.add(new ModelBox(GHALMARAZ, 88, 0, -1.5F, 4.5F, -14.0F, 1, 1, 2, 0.0F, false));
		GHALMARAZ.cubeList.add(new ModelBox(GHALMARAZ, 71, 27, -4.5F, 13.5F, -17.5F, 7, 3, 8, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, -0.1757F, 0.1213F, -0.2403F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 81, 61, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.49F, true));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 81, 84, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.69F, true));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 85, 110, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, true));

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setRotationPoint(1.0F, -0.5F, 0.0F);
		LeftArm.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.0F, 0.0F, 0.1309F);
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 97, 78, -2.75F, -2.5F, -3.0F, 6, 5, 6, 0.1F, true));
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 97, 89, -2.75F, -2.5F, -3.0F, 6, 5, 6, 0.3F, true));

		RightArm_r2 = new ModelRenderer(this);
		RightArm_r2.setRotationPoint(1.1061F, 0.81F, 0.0F);
		LeftArm.addChild(RightArm_r2);
		setRotationAngle(RightArm_r2, 0.0F, 0.0F, 0.0436F);
		RightArm_r2.cubeList.add(new ModelBox(RightArm_r2, 97, 43, -3.0F, -3.5F, -3.0F, 6, 7, 6, -0.15F, true));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 38, 51, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, true));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 38, 67, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, true));

		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setRotationPoint(0.0F, -1.0F, 0.0F);
		LeftLeg.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, 0.0F, 0.0F, -0.0436F);
		RightLeg_r1.cubeList.add(new ModelBox(RightLeg_r1, 38, 35, -2.0F, 1.0F, -2.0F, 4, 12, 4, 0.7F, true));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 38, 51, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 38, 67, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setRotationPoint(0.0F, -1.0F, 0.0F);
		RightLeg.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.0F, 0.0F, 0.0436F);
		RightLeg_r2.cubeList.add(new ModelBox(RightLeg_r2, 38, 35, -2.0F, 1.0F, -2.0F, 4, 12, 4, 0.7F, true));

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightBoot.cubeList.add(new ModelBox(RightBoot, 59, 43, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.5F, false));

		RightLeg_r3 = new ModelRenderer(this);
		RightLeg_r3.setRotationPoint(0.0F, 11.5F, -3.0F);
		RightBoot.addChild(RightLeg_r3);
		setRotationAngle(RightLeg_r3, 0.0873F, 0.0F, 0.0F);
		RightLeg_r3.cubeList.add(new ModelBox(RightLeg_r3, 59, 59, -2.5F, -1.0F, -0.35F, 5, 2, 1, 0.0F, false));

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 59, 43, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.5F, true));

		RightLeg_r4 = new ModelRenderer(this);
		RightLeg_r4.setRotationPoint(0.0F, 11.5F, -3.0F);
		LeftBoot.addChild(RightLeg_r4);
		setRotationAngle(RightLeg_r4, 0.0873F, 0.0F, 0.0F);
		RightLeg_r4.cubeList.add(new ModelBox(RightLeg_r4, 59, 59, -2.5F, -1.0F, -0.35F, 5, 2, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head.render(f5);
		Body.render(f5);
		RightArm.render(f5);
		LeftArm.render(f5);
		LeftLeg.render(f5);
		RightLeg.render(f5);
		RightBoot.render(f5);
		LeftBoot.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}