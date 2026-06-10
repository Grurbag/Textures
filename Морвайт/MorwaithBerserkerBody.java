// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MorwaithBerserkerBody extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer shoulder2;
	private final ModelRenderer shoulder4_r1;
	private final ModelRenderer LeftArm;
	private final ModelRenderer shoulder;
	private final ModelRenderer shoulder4_r2;
	private final ModelRenderer cloth;
	private final ModelRenderer cloth4_r1;
	private final ModelRenderer cloth3_r1;
	private final ModelRenderer cloth2_r1;

	public MorwaithBerserkerBody() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.5F, false));
		Body.cubeList.add(new ModelBox(Body, 16, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.8F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.49F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.69F, false));

		shoulder2 = new ModelRenderer(this);
		shoulder2.setRotationPoint(-3.0F, -2.5F, 0.0F);
		RightArm.addChild(shoulder2);
		setRotationAngle(shoulder2, -3.1416F, 0.0F, 2.3998F);
		shoulder2.cubeList.add(new ModelBox(shoulder2, 1, 53, -3.0F, -0.5F, -4.5F, 7, 2, 9, 0.0F, false));
		shoulder2.cubeList.add(new ModelBox(shoulder2, 0, 46, -1.0F, -4.0F, -3.0F, 5, 5, 0, 0.0F, false));
		shoulder2.cubeList.add(new ModelBox(shoulder2, 0, 46, 0.0F, -5.0F, 0.0F, 5, 5, 0, 0.0F, false));
		shoulder2.cubeList.add(new ModelBox(shoulder2, 0, 46, -1.0F, -4.0F, 3.0F, 5, 5, 0, 0.0F, false));

		shoulder4_r1 = new ModelRenderer(this);
		shoulder4_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		shoulder2.addChild(shoulder4_r1);
		setRotationAngle(shoulder4_r1, 0.0F, 0.7854F, 0.0F);
		shoulder4_r1.cubeList.add(new ModelBox(shoulder4_r1, 0, 54, 0.0F, -1.0F, 4.0F, 2, 1, 2, 0.0F, false));
		shoulder4_r1.cubeList.add(new ModelBox(shoulder4_r1, 0, 54, 2.0F, -1.0F, 2.0F, 2, 1, 2, 0.0F, false));
		shoulder4_r1.cubeList.add(new ModelBox(shoulder4_r1, 0, 54, 4.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 40, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.49F, true));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.69F, true));

		shoulder = new ModelRenderer(this);
		shoulder.setRotationPoint(3.0F, -2.5F, 0.0F);
		LeftArm.addChild(shoulder);
		setRotationAngle(shoulder, 0.0F, 0.0F, 0.7418F);
		shoulder.cubeList.add(new ModelBox(shoulder, 1, 53, -3.0F, -0.5F, -4.5F, 7, 2, 9, 0.0F, false));
		shoulder.cubeList.add(new ModelBox(shoulder, 0, 46, -1.0F, -4.0F, -3.0F, 5, 5, 0, 0.0F, false));
		shoulder.cubeList.add(new ModelBox(shoulder, 0, 46, 0.0F, -5.0F, 0.0F, 5, 5, 0, 0.0F, false));
		shoulder.cubeList.add(new ModelBox(shoulder, 0, 46, -1.0F, -4.0F, 3.0F, 5, 5, 0, 0.0F, false));

		shoulder4_r2 = new ModelRenderer(this);
		shoulder4_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		shoulder.addChild(shoulder4_r2);
		setRotationAngle(shoulder4_r2, 0.0F, 0.7854F, 0.0F);
		shoulder4_r2.cubeList.add(new ModelBox(shoulder4_r2, 0, 54, 0.0F, -1.0F, 4.0F, 2, 1, 2, 0.0F, false));
		shoulder4_r2.cubeList.add(new ModelBox(shoulder4_r2, 0, 54, 2.0F, -1.0F, 2.0F, 2, 1, 2, 0.0F, false));
		shoulder4_r2.cubeList.add(new ModelBox(shoulder4_r2, 0, 54, 4.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

		cloth = new ModelRenderer(this);
		cloth.setRotationPoint(0.0F, 11.0F, -2.0F);
		setRotationAngle(cloth, -2.9671F, 0.0F, -3.1416F);
		cloth.cubeList.add(new ModelBox(cloth, 42, 51, -5.5F, 0.0F, 0.5F, 11, 13, 0, 0.0F, false));

		cloth4_r1 = new ModelRenderer(this);
		cloth4_r1.setRotationPoint(3.2426F, 11.0F, 0.1716F);
		cloth.addChild(cloth4_r1);
		setRotationAngle(cloth4_r1, -1.509F, -0.0617F, 0.7835F);
		cloth4_r1.cubeList.add(new ModelBox(cloth4_r1, 0, 54, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		cloth3_r1 = new ModelRenderer(this);
		cloth3_r1.setRotationPoint(0.2426F, 11.0F, 0.1716F);
		cloth.addChild(cloth3_r1);
		setRotationAngle(cloth3_r1, -1.509F, -0.0617F, 0.7835F);
		cloth3_r1.cubeList.add(new ModelBox(cloth3_r1, 0, 54, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		cloth2_r1 = new ModelRenderer(this);
		cloth2_r1.setRotationPoint(-2.7574F, 11.0F, 0.1716F);
		cloth.addChild(cloth2_r1);
		setRotationAngle(cloth2_r1, -1.509F, -0.0617F, 0.7835F);
		cloth2_r1.cubeList.add(new ModelBox(cloth2_r1, 0, 54, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
		RightArm.render(f5);
		LeftArm.render(f5);
		cloth.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}