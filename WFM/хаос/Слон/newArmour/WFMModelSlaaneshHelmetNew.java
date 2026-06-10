// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelSlaaneshHelmetNew extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer petukh_r1;
	private final ModelRenderer petukh_r2;
	private final ModelRenderer petukh_r3;
	private final ModelRenderer petukh_r4;
	private final ModelRenderer petukh_r5;
	private final ModelRenderer petukh_r6;
	private final ModelRenderer petukh_r7;
	private final ModelRenderer petukh_r8;

	public WFMModelSlaaneshHelmetNew() {
		textureWidth = 80;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.75F, false));
		Head.cubeList.add(new ModelBox(Head, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 1.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 16, -4.5F, -9.0F, -5.1F, 9, 10, 0, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 55, -4.0F, -10.0F, -4.0F, 8, 1, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 42, -1.0F, -11.0F, -4.0F, 2, 1, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 32, 29, 0.0F, -20.0F, -4.0F, 0, 19, 16, 0.0F, false));

		petukh_r1 = new ModelRenderer(this);
		petukh_r1.setRotationPoint(0.0F, -11.0F, -4.0F);
		Head.addChild(petukh_r1);
		setRotationAngle(petukh_r1, 0.0F, 0.0436F, 0.0F);
		petukh_r1.cubeList.add(new ModelBox(petukh_r1, 32, 29, 0.0F, -9.0F, 0.0F, 0, 19, 16, 0.0F, false));

		petukh_r2 = new ModelRenderer(this);
		petukh_r2.setRotationPoint(0.0F, -10.0F, -4.0F);
		Head.addChild(petukh_r2);
		setRotationAngle(petukh_r2, 0.0F, -0.0436F, 0.0F);
		petukh_r2.cubeList.add(new ModelBox(petukh_r2, 32, 29, 0.0F, -10.0F, 0.0F, 0, 19, 16, 0.0F, false));

		petukh_r3 = new ModelRenderer(this);
		petukh_r3.setRotationPoint(0.0F, -10.0F, -4.0F);
		Head.addChild(petukh_r3);
		setRotationAngle(petukh_r3, 0.0F, -0.1745F, 0.0F);
		petukh_r3.cubeList.add(new ModelBox(petukh_r3, 32, 29, 0.0F, -10.0F, 0.0F, 0, 19, 16, 0.0F, false));

		petukh_r4 = new ModelRenderer(this);
		petukh_r4.setRotationPoint(0.0F, -10.0F, -4.0F);
		Head.addChild(petukh_r4);
		setRotationAngle(petukh_r4, 0.0F, -0.1309F, 0.0F);
		petukh_r4.cubeList.add(new ModelBox(petukh_r4, 32, 29, 0.0F, -10.0F, 0.0F, 0, 19, 16, 0.0F, false));

		petukh_r5 = new ModelRenderer(this);
		petukh_r5.setRotationPoint(0.0F, -10.0F, -4.0F);
		Head.addChild(petukh_r5);
		setRotationAngle(petukh_r5, 0.0F, -0.0873F, 0.0F);
		petukh_r5.cubeList.add(new ModelBox(petukh_r5, 32, 29, 0.0F, -10.0F, 0.0F, 0, 19, 16, 0.0F, false));

		petukh_r6 = new ModelRenderer(this);
		petukh_r6.setRotationPoint(0.0F, -10.0F, -4.0F);
		Head.addChild(petukh_r6);
		setRotationAngle(petukh_r6, 0.0F, 0.1745F, 0.0F);
		petukh_r6.cubeList.add(new ModelBox(petukh_r6, 32, 29, 0.0F, -10.0F, 0.0F, 0, 19, 16, 0.0F, false));

		petukh_r7 = new ModelRenderer(this);
		petukh_r7.setRotationPoint(0.0F, -10.0F, -4.0F);
		Head.addChild(petukh_r7);
		setRotationAngle(petukh_r7, 0.0F, 0.1309F, 0.0F);
		petukh_r7.cubeList.add(new ModelBox(petukh_r7, 32, 29, 0.0F, -10.0F, 0.0F, 0, 19, 16, 0.0F, false));

		petukh_r8 = new ModelRenderer(this);
		petukh_r8.setRotationPoint(0.0F, -10.0F, -4.0F);
		Head.addChild(petukh_r8);
		setRotationAngle(petukh_r8, 0.0F, 0.0873F, 0.0F);
		petukh_r8.cubeList.add(new ModelBox(petukh_r8, 32, 29, 0.0F, -10.0F, 0.0F, 0, 19, 16, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}